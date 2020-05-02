import processing.core.PApplet;

import static processing.core.PConstants.P2D;

public class Main extends PApplet {

        // definimos atributos para toda la clase
        // es la ventana de salida de la aplicacion
        // en Processing las aplicaciones se llaman sketchs
        int viewport_w = 640; // ancho en pixels
        int viewport_h = 360; // alto en pixels


        public static void main(String args[]) {
            PApplet.main("Main");
        }


        @Override
        public void settings() {
            size(viewport_w, viewport_h, P2D);
            smooth(8);
        }


        @Override
        public void setup() {
        }


        @Override
        public void draw() {
            // pintamos la ventana según rgb

            background(251, 129, 8 );


            //esto es para que te lea el raton por donde pasas
            stroke(201,41,255);
            fill(225,247,41);
            ellipse(mouseY, mouseX, 100, 100);
            stroke(245,44,86);
            fill(145,251,66);
            rect(mouseX, mouseY, 50, 50);
        }
    }

