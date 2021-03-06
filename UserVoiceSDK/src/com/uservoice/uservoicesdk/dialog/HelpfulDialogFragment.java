package com.uservoice.uservoicesdk.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;

import com.uservoice.uservoicesdk.R;
import com.uservoice.uservoicesdk.ui.Utils;

public class HelpfulDialogFragment extends DialogFragmentBugfixed {

	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        if (!Utils.isDarkTheme(getActivity())) {
            builder.setInverseBackgroundForced(true);
        }
		builder.setTitle(R.string.uv_helpful_article_message_question);
		
		builder.setNegativeButton(R.string.uv_no, new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				dialog.cancel();
				getActivity().finish();
			}
		});
		
		builder.setPositiveButton(R.string.uv_yes, null);
		
		return builder.create();
	}
}
