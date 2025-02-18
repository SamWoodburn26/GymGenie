// Generated by view binder compiler. Do not edit!
package edu.quinnipiac.ser210.myapplication.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import edu.quinnipiac.ser210.myapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentInformationBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final TextView byWho;

  @NonNull
  public final TextView howToUse;

  @NonNull
  public final TextView info;

  private FragmentInformationBinding(@NonNull FrameLayout rootView, @NonNull TextView byWho,
      @NonNull TextView howToUse, @NonNull TextView info) {
    this.rootView = rootView;
    this.byWho = byWho;
    this.howToUse = howToUse;
    this.info = info;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentInformationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_information, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentInformationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.byWho;
      TextView byWho = ViewBindings.findChildViewById(rootView, id);
      if (byWho == null) {
        break missingId;
      }

      id = R.id.howToUse;
      TextView howToUse = ViewBindings.findChildViewById(rootView, id);
      if (howToUse == null) {
        break missingId;
      }

      id = R.id.info;
      TextView info = ViewBindings.findChildViewById(rootView, id);
      if (info == null) {
        break missingId;
      }

      return new FragmentInformationBinding((FrameLayout) rootView, byWho, howToUse, info);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
