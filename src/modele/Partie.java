/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modele;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author Rasem
 */
public class Partie extends Observable{
     private List<Boolean> choixA;
    private List<Boolean> choixB;

    public Partie() {
        choixA = new ArrayList<Boolean>();
        choixB = new ArrayList<Boolean>();
    }

    public int getScoreA() {
        int res=0;
        for(int i=0;i<choixA.size();i++)
            res=res+getGainA(i);        
        return res;
    }

    public int getScoreB() {
        int res=0;
        for(int i=0;i<choixB.size();i++)
            res=res+getGainB(i);        
        return res;
    }

    public int getNbCoups() {
        return choixA.size();
    }
    /*
     assure getNbCoups > 0 et getNbCoups()==old+1
     garantit que AaCoopere(getNbCoups())==aCoopere
     */

    public void cooperer(boolean aCoopere, boolean bCoopere) {
        choixA.add(aCoopere);
        choixB.add(bCoopere);
        //indique que l'objet a change
        setChanged();
        //avertir les observateurs
        notifyObservers(this);
        
    }

    public boolean AaCoopere(int nbCoup) {
        return choixA.get(nbCoup);
    }

    public boolean BaCoopere(int nbCoup) {
        return choixB.get(nbCoup);
    }

    public int getGainA(int nbCoup) {
        int res;
        if (AaCoopere(nbCoup) && BaCoopere(nbCoup)) {
            res = 3;
        } else if (AaCoopere(nbCoup) && !BaCoopere(nbCoup)) {
            res = 0;
        } else if (!AaCoopere(nbCoup) && BaCoopere(nbCoup)) {
            res = 5;
        } else {
            res = 1;
        }
        return res;

    }

    public int getGainB(int nbCoup) {
        int res;
        if (choixA.get(nbCoup) && choixB.get(nbCoup)) {
            res = 3;
        } else if (choixA.get(nbCoup) && !choixB.get(nbCoup)) {
            res = 5;
        } else if (!choixA.get(nbCoup) && choixB.get(nbCoup)) {
            res = 0;
        } else {
            res = 1;
        }

        return res;
    }
}
