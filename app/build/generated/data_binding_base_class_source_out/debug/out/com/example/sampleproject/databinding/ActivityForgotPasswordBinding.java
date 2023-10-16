// Generated by view binder compiler. Do not edit!
package com.example.sampleproject.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.sampleproject.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityForgotPasswordBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button button2;

  @NonNull
  public final EditText editTextTextEmailAddress2;

  @NonNull
  public final TextView forgotYourPasswordHeading;

  @NonNull
  public final TextView textView3;

  private ActivityForgotPasswordBinding(@NonNull ConstraintLayout rootView, @NonNull Button button2,
      @NonNull EditText editTextTextEmailAddress2, @NonNull TextView forgotYourPasswordHeading,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.button2 = button2;
    this.editTextTextEmailAddress2 = editTextTextEmailAddress2;
    this.forgotYourPasswordHeading = forgotYourPasswordHeading;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityForgotPasswordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_forgot_password, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityForgotPasswordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.editTextTextEmailAddress2;
      EditText editTextTextEmailAddress2 = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress2 == null) {
        break missingId;
      }

      id = R.id.forgotYourPasswordHeading;
      TextView forgotYourPasswordHeading = ViewBindings.findChildViewById(rootView, id);
      if (forgotYourPasswordHeading == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityForgotPasswordBinding((ConstraintLayout) rootView, button2,
          editTextTextEmailAddress2, forgotYourPasswordHeading, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
