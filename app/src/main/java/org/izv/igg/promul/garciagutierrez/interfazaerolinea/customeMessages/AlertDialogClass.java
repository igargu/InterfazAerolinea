package org.izv.igg.promul.garciagutierrez.interfazaerolinea.customeMessages;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.DialogFragment;

import org.izv.igg.promul.garciagutierrez.interfazaerolinea.R;

/**
 * Esta clase define el AlertDialog customizado.
 */
public class AlertDialogClass extends DialogFragment {

    private Context context;
    private Toast toast;

    @Override
    public Dialog onCreateDialog(Bundle savedInstance) {

        context = getActivity();

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Procesamiento de compra")
                .setMessage("¿Desea continuar?")
                .setPositiveButton("CONFIRMAR",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                                toast = Toast.makeText(context, "Compra realizada", Toast.LENGTH_SHORT);
                                View toastView = toast.getView();
                                toastView.getBackground().setColorFilter(getResources().getColor(R.color.green), PorterDuff.Mode.SRC_IN);
                                toast.show();
                            }
                        })
                .setNegativeButton("DENEGAR",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
        return builder.create();
    }
}
