package programa.date.es
public class Date(){
	int dia, mes, ano;
	this.dia = 0;
	this.mes = 0;
	this.ano = 0;
}
public class Date(int dia, int mes, int ano) throws ExceptionVic{
	StringBuffer men = new StringBuffer();
	if ((dia > 0) && (dia <= 31)){
	}else men.append("Dia incorrecto. ");
	if ((mes < 1) || (mes > 12)){
		men.append("Mes incorrecto. ");
	}
	if (ano < 0){
		men.append("Año incorrecto. ");
	}
	if ((men.toString().length()) != 0){
		throw new ExceptionVic(men.toString()); 
	}else{
		this.ano = ano;
		this.dia = dia;
		this.mes = mes;
	}
	boolean isSameYear(Date fecha){
		return (this.ano == fecha.ano);
	}
	boolean isSameDay(Date fecha){
		return (this.dia == fecha.dia);
	}
	boolean isSameMonth(Dare fecha){
		return (this.mes == fecha.mes);
	}
	boolean isSame(Date fecha){
		return (((this.isSameMonth(fecha)) && (this.isSameDay(fecha)) && (this.isSameYear(fecha)));
	}
	
		
}
