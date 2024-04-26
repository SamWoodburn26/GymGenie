package edu.quinnipiac.ser210.myapplication
/*
  * Gabby Pierce and Sam Woodburn
  * Final Project SER210
  * Gym Genie
  * recycler adapter: for the all workouts fragment to display the exercise names; xml list_item
 */

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.ser210.myapplication.APIData.ExerciseItem
import edu.quinnipiac.ser210.myapplication.databinding.ListItemBinding



class RecyclerAdapter(private var dataSet: MutableList<ExerciseItem>, private val onItemRemoved: OnItemRemoved) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {


    //list of exercise items
    lateinit var exerciseItemList: List<ExerciseItem>

    //view holder class
    class ViewHolder(private val binding: ListItemBinding, dataSet: MutableList<ExerciseItem>, onItemRemoved: OnItemRemoved): RecyclerView.ViewHolder(binding.root) {
       init {
           /*
           itemView.setOnClickListener{
               val itemToRemove = dataSet[position]
               // Remove the item from your data set
               dataSet.remove(itemToRemove)
               val currentList = dataSet.toMutableList()
           }
            */
           binding.deleteButton.setOnClickListener{
               onItemRemoved.onItemRemove(dataSet[position])
           }
       }
        fun bind(exercise: ExerciseItem) {
            //bind exercise name
            binding.exerciseName.text = "Exercise Name: ${exercise.name}"
        }
    }

    //get current list of exercise items
    fun getCurrentList(): MutableList<ExerciseItem> {
        return dataSet
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)
        //exercise list = dataset class parameter
        exerciseItemList = dataSet
        //bind to list item layout and return
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding, dataSet, onItemRemoved)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        //bind exercise to holder
        val exercise = dataSet[position]
        holder.bind(exercise)
        holder.bind(dataSet[position])
    }

    override fun getItemCount() = dataSet.size


    //load a list of exercises to the dataset variable
    fun submitList(newExercises: MutableList<ExerciseItem>) {
        val diffCallback = object : DiffUtil.Callback() {
            override fun getOldListSize(): Int = dataSet.size
            override fun getNewListSize(): Int = newExercises.size

            override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                // This depends on whether ExerciseItem has an ID or some unique property; If it does not have a unique identifier, you may need to compare names or another field
                return dataSet[oldItemPosition] == newExercises[newItemPosition]
            }

            override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
                return dataSet[oldItemPosition] == newExercises[newItemPosition]
            }
        }

        val diffResult = DiffUtil.calculateDiff(diffCallback)
        //update dataset variable
        dataSet = newExercises
        diffResult.dispatchUpdatesTo(this)
    }

}