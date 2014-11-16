package helloworld.shubham.jobmatcher;

import org.json.JSONException;
import org.json.JSONObject;

import helloworld.shubham.jobmatcher.R.id;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.Window;
import android.view.ViewGroup.LayoutParams;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class TypeMoreInfoDialog {
    Context ctx;
    private EditText infoWhyApplyingET;

    public TypeMoreInfoDialog(Context ctx){
        this.ctx = ctx;
    }

    public void displayBookingSuccessfulDialog(){

        //Set up the dialog
        final Dialog dialog = new Dialog(ctx);
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogSlideUpAnimation;
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.more_information);
        dialog.getWindow().setLayout(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);

        infoWhyApplyingET = (EditText) dialog.findViewById(R.id.infoWhyApplyingET);
        Button submitBTN = (Button) dialog.findViewById(R.id.submitBTN);

        dialog.show();

        submitBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String infoApplying = infoWhyApplyingET.getText().toString();
                uploadToParse(infoApplying);
                dialog.dismiss();
            }
        });
    }

    public void uploadToParse(String infoApplying)
    {
        // append infoString to "info" array and append userId to "Applicants" array
        Toast.makeText(ctx, "upload to parse here", Toast.LENGTH_LONG);
    }
}
