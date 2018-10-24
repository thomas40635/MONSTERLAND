package vue;

import javax.swing.JFrame;

public class JeuFenetre  extends JFrame{
	
	public JeuFenetre(){
		super();
		build(); //On initialise notre fenêtre de jeu
	}
	
	//Methode contenant tous les parametres d'affichage
	private void build(){
		setTitle("MonsterLand"); //Titre à l'application
		setSize(320,240); //Taille à notre fenêtre
		setLocationRelativeTo(null); //Centre la fenêtre sur l'écran
//		setResizable(false); //Interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Dit à l'application de se fermer lors du clic sur la croix
	}
}
