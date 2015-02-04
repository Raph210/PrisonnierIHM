/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import modele.Partie;
/**
 *
 * @author Rasem
 */
public class PartieTest {
     public PartieTest() {
    }

    @Test
    public void testLancement() {
        Partie partie = new Partie();
        assertEquals(0, partie.getNbCoups());
        assertEquals(0, partie.getScoreA());
        assertEquals(0, partie.getScoreB());
    }

    @Test
    public void testJouerCC() {
        Partie partie = new Partie();
        partie.cooperer(true, true);
        assertEquals(1, partie.getNbCoups());
        assertEquals(3, partie.getScoreA());
        assertEquals(3, partie.getScoreB());
    }

    @Test
    public void testJouerCD() {
        Partie partie = new Partie();
        partie.cooperer(true, false);
        assertEquals(1, partie.getNbCoups());
        assertEquals(0, partie.getScoreA());
        assertEquals(5, partie.getScoreB());
    }
    
    @Test
    public void testJouerDC(){
        Partie partie = new Partie();
        partie.cooperer(false, true);
        assertEquals(1, partie.getNbCoups());
        assertEquals(5, partie.getScoreA());
        assertEquals(0, partie.getScoreB());
    }
    
     @Test
    public void testJouerDD(){
        Partie partie = new Partie();
        partie.cooperer(false, false);
        assertEquals(1, partie.getNbCoups());
        assertEquals(1, partie.getScoreA());
        assertEquals(1, partie.getScoreB());
    }
    
    @Test
    
    public void testSynthese(){              
        
        Partie partie = new Partie();
        partie.cooperer(true, true);//3,3
        partie.cooperer(true, false);//0,5
        partie.cooperer(false, true);//5,0
        partie.cooperer(false, false);//1,1
        
        assertEquals(4, partie.getNbCoups());
        assertEquals(9, partie.getScoreA());
        assertEquals(9, partie.getScoreB());

        
        
        
        
        
    }
}
