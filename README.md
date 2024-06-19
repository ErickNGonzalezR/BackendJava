# **Guia de Java**
## **COMO CREAR ARCHIVOS .jar**
son archivos ejecutables de java utiliza los archivos tipo zip 
file -> project Structure -> Atrifacts -> + -> JAR -> From modules with dependencies 

Vamos a la carpeta out
build -> build Artifacts -> se abre un menu y seleccionamos Build

## **bitycode**

bitycode
.class
## **ATAJOS EN JAVA**
- main 	se hace main solo
- sout	System.out.print("");
## **Normas**
-	Las constates se escriben en MAYUSCULAS y Contienen _ si es de 2 parablras COLOR_ROJO
-	Las clase se escriben upper camel case  (la primera letra en mayuscula)
-	Las variables y los metodos se escriben con lower camel case (la primera letra en minuscula)
## **TIPOS DE DATOS**

	NOMBRE		TIPO			OCUPA		RANGO
	byte 		entero 			1 byte		-128 a 127	
	short		entero			2 bytes		-32768 a 32767
	int			entero			4bytes		2,000,000,000					Se le coloca una L al final del numero 1321561513L
	long		entero			8bytes		muy grande
	float		decimal simple		4 bytes 	muy grande
	double		decimal doble		8 bytes		muy grande
	char		caracter simple		2 bytes		muy grande					Se le coloca comillas simples
	String 		cadena de texto				muy grande						Se le colocan comillas dobles
	boolean		valor true o false	1 bit  
	DateTime	2021-09-10 10:05:05
	Date		2021-09-10
 	float		DECIMAL SIMPLE 		MUY GRANDE								EL NUMERO SIEMPRE TIENE QUE TENER UNA F AL FINAL
	
	var 		con el tipo de dato var deduce el tipo de dato que es la variable en jdk 10

## **OPERADORES DE COMPARACION O REALCIONALES**
	OPERADOR	DESCRIPCION		EJEMPLO
	==		igual			5 == 5
	>		mayor que		200 > 15
	<		menor que 		95 < 100 
	>=		mayor igual		100 >= 100
	<=		menor igual		100 <= 105
	!=		diferente		10 != 5
	~= 		NOT EQUAL 		NO IGUAL
	=					ASIGNACION
## **OPERADORES ARITMETICOS**
	+ 	SUMA 			NUM 1 + NUM 2 
	++ 	INCREMENTO 		NUM 1 ++ 	PRIMERO SE ASIGNA Y DESPUES SE INCREMENTA
	++ 	INCREMENTO 		++ NUM 1  	PRIMERO SE INCREMENTA Y DESPUES SE ASIGNA
	- 	RESTA 			NUM 1 - NUM 2
	-- 	DECREMENTO 		NUM 1 --	PRIMERO SE ASIGNA Y DESPUES SE RESTA
	-- 	DECREMENTO 		-- NUM 1 	PRIMERO SE RESTA Y DESPUES SE ASIGNA
	* 	MULTIPLICACION 		NUM 1 * NUM 2 
	/ 	DIVISION 		NUM 1 / NUM 2 
	% 	RESTO 			NUM 1 % NUM 2
	^	POTENCIA 		X ^ n EL VALOR DE X ELEVADO A LA n 

## **OPERADORES ARITMETICOS CON ASIGNACION**
-	numero = numero + 5;
-	numero += 5; 
-	numero = numero - 5;
-	numero -= 5;
-	numero = numero * 5;
-	numero *= 5;
-	numero = numero / 5;
-	numero /= 5;
-	numero = numero % 5;
-	numero %= 5;

## **OPERADORES LOGICOS**
### **NOT (~)**
#### **Agarra un valor booleano y lo comvierte a lo opuesto**	
		
	EJEMPLO:
		Si agarramos un valor que es verdadero y lo pasamos por un not lo comvertira en un 
		valor falso.	
### **AND (&&)**	
#### **Compara dos datos booleanos y compara que los dos sean verdaderos**
		
	EJEMPLO:
		- Si los dos datos son verdaderos el resulrado va a devolver un dato verdadero.
		- Si uno de los datos es falso y el otro es verdadero va a devolvre un dato falso.
		- Si los dos datos son falsos va a devolver un dato falso.
### **OR (||)**
#### **Si uno de los valores cumple la condicion da un valor verdadero.**
		
	EJEMPLO:
		- Si los dos valores son verdaderos va a devolver un valor verdadero.
		- Si uno de los valores es falso y el otro es verdadero va a devolver un valor verdadero.
		- Si los dos valores son falsos va a devolver un valor falso.
	EJEMPLO:
		- EDAD = 20
		- (EDAD >= 18) && (EDAD < 70)  TRUE
		- NOT ((EDAD < 18) || (EDAD >= 70)) TRUE	

## **CLASE MATH**
### **COMO HACER UNA RAIZ CUARDRADA**
	
		double variable = Math.sqrt(numero);
### **COMO HACERUNA POTENCIACION**	
		double base , exponente;
### 
		double resultado = Math.pow(base , exponente);

### **COMO REDONDEAR UN NUMERO**	
 
		double numero = 4.56; 
		long resultado = Math.round(numero); // 5
### 
		float numero = 4.56f;
		int resultado = Math.rount(numero); // 5  

### **DEVUELVE UN NUMERO ENTERO QUE REDONDEA HACIA ARRIBA**
		float numero = 4.1f;
		int resultado = Math.ceil(numero); // 5

### **DEVUELVE UN NUMERO ENTERO QUE REDONDEA HACIA ABAJO**	
		float numero = 4.8f;
		int resultado = Math.floor(numero); // 4

### **DEVUELVE EL VALOR MAS GRANDE ENTRE 2 DATOS**
		float numero = 4.8f,n = 3;
### 
		int resultado = Math.max(numero,n); // 4.8

### **COMO OBTENER UN NUMERO ALEATORIO**
		double numero = Math.random()	

  ### **NUMEROS ENTEROS**
		
		//CLASE
		import java.util.Random;
		
		Random claseRandom = new Random();
		int n = claseRandom.nextInt(101);

## **ESTRUCTURAS**
### **SI NO**
		if(condicion){
		
		}
		else{
	
		}
#### **Ejemplo**
		boolean isTurnLight = false;
		if (isTurnLight){
			isTurnLight = false;
		}else{
			isTurnLight = true;
		}
  ### **OPERADOR TERNEARIO PARA IF**
		
		isTurnLight =()? valorRegreso (Si la condicion se cumple de vuelve valorRegreso): valorRegreso1 (Si la condicopn no se cumple de vuelve valorRegreso1);
		isTurnLight = (isTurnLight)? false : true;
### **BUCLES**
#### **WHILE**
			int contador = 0;
			while(contador<3){
				contador ++;
				verificarConexion();
			}
   
#### **DO WHILE**
			int contador = 0;
			do{
				contador ++;
				verificarConexion();
			}while(contador < 3);

#### **FOR**
			for(int cont = 0; cont < 3; cont++){
				verificarConexion();  
			}

		// Si escribimos fori se hace solo

		// BREAK rompe los ciclos

#### **SWITCH**
		switch(dato){
		case 1:instrucciones;
			break
		caso 2:instrucciones;
			break
		case n :instrucciones;
			break
		default:caso contrario;
			break;
		}
  
#### **OTRA ESTRUCTURA SWITCH (FUNCIONA PARA JAVA 12)**
			switch (a){
				case valor1 -> ;
				case valor2 -> ;
				case valor3 -> ;
				case valor4 -> ;
				case valor5 -> ;
				default -> "N/A"
			}

## **LINEA DE SAIDA DE DATOS**
	System.out.println("  ");
 
## **INGRESAR DATOS DESDE LA TERMINAL**

	Scanner sc = new Scanner (System.in);
 ### 
	int variable = Integer.valueOF(sc.nextLine());

## **DECLARACION DE CONSTANTES**
### **Se coloca la palabra final al principio cuan do se declara una variable**
	final int NUMERO = 10 ; 

### **ENTRADA Y SALIDA DE DATOS**
	jOptionPane.showInputDialog(¨ ¨);

### 
	JOptionPane.showMessage(null, ¨   ¨);

## **PARA INGRESAR DATOS DESDE EL TECLADO CON UN CUADRO DE TEXTO SE UTILIZA**
	variable = JOptionPane.showInputDialog(null," mensaje ")

## **PARA IMPRIMIR UN MENSAJE CON UN CUADRO DE TEXTO SE UTILIZA**
	JOptioPane.showMssageDialog(null," mensaje " + VARIABLE)

## **PARA COMVERTIR DE STRING A INTEGER, DOUBLE, CHAR, FLOAT**
    variable = Integer.parseInt(strvariable);
	### 
    variable = Double.parsDouble(strvariable); 
  ### 
    variable = jOptionPane.showInputDialog(¨digite un caracter: ).charAT.(0);
 ###  
    variable = Float.parseFloat();

## **PARA COMVERTIR DE INTEGER A DOUBLE**
	Double.valueOf(variable)
### **CASTING (Cambiar el tipo de dato)**
	double numero = 2130132.1231
 ### 
	int n = (int)numero 
	### 
    n = 2130132
- double -> float -> long -> int -> short -> byte
- byte <-> char
- short <->char
- int -> char
## **FUNCIONES**
### **Se puden colocar en la misma clase donde se encuentra en main (por fuera)**
		public static int suma (int a, int b){
			return a+b;
		}
### **Siempre se le coloca static**
	  
	//ESRUCTURA
		[modificadores] tipo_retorno nombre_funcion([argumentos]){
		codigo
		}
		
		public int suma (int a, int b){
			return a+b;
		}

- Cuando tiene un valor de regreso : return
- Cuando no tiene un valor de regreso : void  en vez de int

### **PARA LLAMAR UNA FUNCION SE ESCRIBE**
		int c = suma (5,7)
	
		nombre_de_la_funcion(variables)
		calcularnumeromayor(numero1, numero2, numer3)

### **Ejemplo**
	
		private static void calcular numeromayor(int numero1, int numero2, 
			int numero3){
			int numeromayor=numero1
			if (numero2 > numeromayor){
				numero mayor = numero2;
			}
			if (numero2 > numeromayor){	
				numeromayor = numero3;
			}
			JOptionPane.showMessage(null,"el numero mayoer es: " + numeromayor)
			}
			// void significa que no va ha devolver ningun valor

			public static integer cargarnumero(){	
				string strnumero = JOptionPane.showInputDialog(null," mensaje ");			
				int numero = Integer.parseInt(strnumero)
				return numero;
			}
   
   ### **PARA LLAMAR LA FUNCION**
			int variable = cargarnumero()

## **FORMULARIOS**
### **PARA LLAMAR UN FORMULARIO**	
		public static void main (String[] args){
		formulario ventana = new formulario();
		ventana.show;
		}
  
### **PARA ACCERDER A LA CAJA DE TEXTO SE COLOCA **
		String variable =this.txtcajadetxto.getText();

## **ARREGLOS**
	String[] nombreVariable = new String [tamañoArreglo];
 
### **PARA HACER ARREGLOS SIN NECESIDAD DE COLOCAR TAMAÑO**
		List<String> lista = new Ar rayList<String>();
		lista.add(variable);

### **LIBRERIA NECESARIAS PARA LOS ARREGLOS**
		import java.util.ArrayList;
		import java.util.List;

## **JAVA DOC**
	 * DESCRIPCION: descripcion de la funcion	
	 * @param Nombre variable DESCRIPCION para que es 
	 *  @param Nombre variable DESCRIPCION para que es
	 *  @return Nombre variable que devuelve
	 */ JAVA DOC va arriba de la funcion que le queremos agregar la documentacion

## **COMENTATARIOS**

	 // 
 ### 
	 /* */
 ### 
	 /*
  	*
   	*
    	*/
  ### 
	 
## **ACTIVACION EN ENTELLIJ IDEA**
inrellj idea -> settings  -> editor -> general -> code completion ->show the documentation popup 

	 https://es.wikipedia.org/wiki/Javadoc

### **PROGRAMACION ORIENTADA A OBJETOS**
PROGRAMACION ORIENTADA A OBJETOS ES UNA ABTRACCION DE ALGO QUE PUEDA VER EN EL MUNDO REAL
EN PROGRAMACION ORIENTADA A OBJETOS HAY CLASES, LAS VARIABLES QUE SE ENCUENTRAN
DENTRO SE VA A LLAMAR PROPIEDADES Y LAS FUNCIONES METODOS QUE SE ENCUENTRAN EN ELLAS.

	SIEMPRE QUE QUERAMOS MODIFICAR O ESBLECER DATOS TRAEMOS UN SET.***** 
	SIEMPRE QUE QUERAMOS TRAER O OBTENER UN DATO UTILIZAMOS UN GET.******
