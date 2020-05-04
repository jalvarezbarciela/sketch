import processing.core.PApplet;



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
            // pintamos el fondo

            background(20, 247, 201 );
            //elegimos el color del borde
            stroke(255, 255, 255);
            /* elegimos el color del interior , se aplica a las formas de debajo hasta el siguiente fill */
            fill(0,255,0);
            rect(0,300,640,100);
            fill(255,255,255);
            //dibuja un circulo
            ellipse(200,100,100,100);
            ellipse(240,105,100,100);
            ellipse(160,75,100,100);
            ellipse(160,125,100,100);
            ellipse(240,120,100,100);
            fill(0,255,0);
            ellipse(460,150,100,100);
            ellipse(400,105,100,100);
            ellipse(460,75,100,100);
            ellipse(410,140,100,100);
            ellipse(450,120,100,100);
            fill(173,105,0);
            //dibuja un cuadrado
            rect(420,190,10,120);
            //esto es para que te lea el raton por donde pasas
            stroke(201,41,255);
            fill(225,247,41);
            ellipse(mouseX, 15, 100, 100);

        }
    }

