package faancorp.com.faanproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import java.util.List;

public class Chargement extends Activity {

    /**
     * Classe Chargement liee a la premiere view lorsqu on demarre l application (ecran avec logo de la sibra pendant quelques secondes).
     */
    @Override
    public void onCreate(Bundle savedInstanceState) { //Lorsque le view est cree
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chargement); //On lui dit quelle view afficher

        Handler handler = new Handler(); //Ce qui sert a compter le temps
        final Intent tostart = new Intent(this, MainActivity.class);

        handler.postDelayed(new Runnable() {
            public void run() {
                startActivity(tostart); //On lance l activity FragmentsSliderActivity
                finish(); //On detruit l activite en cours
            }
        }, 3000); //3 secondes

    }
}