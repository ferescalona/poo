
public class Carro{
	int velMax;
	boolean encendido;
	String color, matricula,tipoCombustible;
	double accMax,velActual,nivelCombusMax,nivelCombusActual,desgasteCombus;

	//constructor
	//método que utiliza una plantilla para inicializar valores e instanciar un objeto
	//public nombreDeLaClase(Atributos)
	

	public  void Prender(){
		if(this.encendido){
			//proceso de encender
			//5 unidades de gasolina para encender
			if(this.nivelCombusActual>5){
				this.encendido=true;
				this.nivelCombusActual=this.nivelCombusAtual-1.5;
			}
		}else{
			System.out.println("El carro está apagado");
		}
	}

	//Método CargarGas
	public void CargarGas(){
		if(this.nivelCombusActual<this.nivelCombusMax){
			int cantRecargar= 3;
			if(this.nivelCombusActual+cantRecargar<=this.nivelCombusMax){
				this.nivelCombusActual=this.nivelCombusActual+cantARecargar;
				System.out.println("Recargaste exitosamente")

			}else{
				System.out.println("No puedes recargar más de la capacidad del tanque")
			}
		}
	}

	public void Acelerar(){
		if(this.encendido){
			
				this.velActual=this.velActual-5;
			}else{
				System.out.println("Sin gasolina...Apagando auto...");
				this.apagar;
			}
		}
	}
}