// Generated by view binder compiler. Do not edit!
package com.example.mycalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.mycalculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCalculatorBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button button0;

  @NonNull
  public final Button button1;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final Button button5;

  @NonNull
  public final Button button6;

  @NonNull
  public final Button button7;

  @NonNull
  public final Button button8;

  @NonNull
  public final Button button9;

  @NonNull
  public final Button buttonAC;

  @NonNull
  public final Button buttonDivide;

  @NonNull
  public final Button buttonDot;

  @NonNull
  public final Button buttonEquals;

  @NonNull
  public final Button buttonMultiply;

  @NonNull
  public final Button buttonPlusMinus;

  @NonNull
  public final Button buttonSubtract;

  @NonNull
  public final Button buttonSum;

  @NonNull
  public final TextView outText;

  private FragmentCalculatorBinding(@NonNull LinearLayout rootView, @NonNull Button button0,
      @NonNull Button button1, @NonNull Button button2, @NonNull Button button3,
      @NonNull Button button4, @NonNull Button button5, @NonNull Button button6,
      @NonNull Button button7, @NonNull Button button8, @NonNull Button button9,
      @NonNull Button buttonAC, @NonNull Button buttonDivide, @NonNull Button buttonDot,
      @NonNull Button buttonEquals, @NonNull Button buttonMultiply, @NonNull Button buttonPlusMinus,
      @NonNull Button buttonSubtract, @NonNull Button buttonSum, @NonNull TextView outText) {
    this.rootView = rootView;
    this.button0 = button0;
    this.button1 = button1;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.button5 = button5;
    this.button6 = button6;
    this.button7 = button7;
    this.button8 = button8;
    this.button9 = button9;
    this.buttonAC = buttonAC;
    this.buttonDivide = buttonDivide;
    this.buttonDot = buttonDot;
    this.buttonEquals = buttonEquals;
    this.buttonMultiply = buttonMultiply;
    this.buttonPlusMinus = buttonPlusMinus;
    this.buttonSubtract = buttonSubtract;
    this.buttonSum = buttonSum;
    this.outText = outText;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCalculatorBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_calculator, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCalculatorBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_0;
      Button button0 = ViewBindings.findChildViewById(rootView, id);
      if (button0 == null) {
        break missingId;
      }

      id = R.id.button_1;
      Button button1 = ViewBindings.findChildViewById(rootView, id);
      if (button1 == null) {
        break missingId;
      }

      id = R.id.button_2;
      Button button2 = ViewBindings.findChildViewById(rootView, id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button_3;
      Button button3 = ViewBindings.findChildViewById(rootView, id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button_4;
      Button button4 = ViewBindings.findChildViewById(rootView, id);
      if (button4 == null) {
        break missingId;
      }

      id = R.id.button_5;
      Button button5 = ViewBindings.findChildViewById(rootView, id);
      if (button5 == null) {
        break missingId;
      }

      id = R.id.button_6;
      Button button6 = ViewBindings.findChildViewById(rootView, id);
      if (button6 == null) {
        break missingId;
      }

      id = R.id.button_7;
      Button button7 = ViewBindings.findChildViewById(rootView, id);
      if (button7 == null) {
        break missingId;
      }

      id = R.id.button_8;
      Button button8 = ViewBindings.findChildViewById(rootView, id);
      if (button8 == null) {
        break missingId;
      }

      id = R.id.button_9;
      Button button9 = ViewBindings.findChildViewById(rootView, id);
      if (button9 == null) {
        break missingId;
      }

      id = R.id.button_AC;
      Button buttonAC = ViewBindings.findChildViewById(rootView, id);
      if (buttonAC == null) {
        break missingId;
      }

      id = R.id.button_divide;
      Button buttonDivide = ViewBindings.findChildViewById(rootView, id);
      if (buttonDivide == null) {
        break missingId;
      }

      id = R.id.button_dot;
      Button buttonDot = ViewBindings.findChildViewById(rootView, id);
      if (buttonDot == null) {
        break missingId;
      }

      id = R.id.button_equals;
      Button buttonEquals = ViewBindings.findChildViewById(rootView, id);
      if (buttonEquals == null) {
        break missingId;
      }

      id = R.id.button_multiply;
      Button buttonMultiply = ViewBindings.findChildViewById(rootView, id);
      if (buttonMultiply == null) {
        break missingId;
      }

      id = R.id.button_plusMinus;
      Button buttonPlusMinus = ViewBindings.findChildViewById(rootView, id);
      if (buttonPlusMinus == null) {
        break missingId;
      }

      id = R.id.button_subtract;
      Button buttonSubtract = ViewBindings.findChildViewById(rootView, id);
      if (buttonSubtract == null) {
        break missingId;
      }

      id = R.id.button_sum;
      Button buttonSum = ViewBindings.findChildViewById(rootView, id);
      if (buttonSum == null) {
        break missingId;
      }

      id = R.id.out_Text;
      TextView outText = ViewBindings.findChildViewById(rootView, id);
      if (outText == null) {
        break missingId;
      }

      return new FragmentCalculatorBinding((LinearLayout) rootView, button0, button1, button2,
          button3, button4, button5, button6, button7, button8, button9, buttonAC, buttonDivide,
          buttonDot, buttonEquals, buttonMultiply, buttonPlusMinus, buttonSubtract, buttonSum,
          outText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}