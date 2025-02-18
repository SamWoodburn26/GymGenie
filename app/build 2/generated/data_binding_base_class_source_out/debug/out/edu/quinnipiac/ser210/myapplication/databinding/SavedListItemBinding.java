// Generated by view binder compiler. Do not edit!
package edu.quinnipiac.ser210.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.card.MaterialCardView;
import edu.quinnipiac.ser210.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class SavedListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView exerciseNameTextView;

  @NonNull
  public final TextView repsTextView;

  @NonNull
  public final TextView workoutName;

  private SavedListItemBinding(@NonNull MaterialCardView rootView,
      @NonNull TextView exerciseNameTextView, @NonNull TextView repsTextView,
      @NonNull TextView workoutName) {
    this.rootView = rootView;
    this.exerciseNameTextView = exerciseNameTextView;
    this.repsTextView = repsTextView;
    this.workoutName = workoutName;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static SavedListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static SavedListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.saved_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static SavedListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.exerciseNameTextView;
      TextView exerciseNameTextView = ViewBindings.findChildViewById(rootView, id);
      if (exerciseNameTextView == null) {
        break missingId;
      }

      id = R.id.repsTextView;
      TextView repsTextView = ViewBindings.findChildViewById(rootView, id);
      if (repsTextView == null) {
        break missingId;
      }

      id = R.id.workoutName;
      TextView workoutName = ViewBindings.findChildViewById(rootView, id);
      if (workoutName == null) {
        break missingId;
      }

      return new SavedListItemBinding((MaterialCardView) rootView, exerciseNameTextView,
          repsTextView, workoutName);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
