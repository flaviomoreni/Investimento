package br.com.fiap.investimento.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TratandoExceptionTest {

	public static void main(String[] args) throws Exception {
		
		System.out.println( formatarDataFiap("0101/2000") );
		
		formatarDataFiap2("0101/2000");
	}

	
	public static Date formatarDataFiap(String dataDigitada) {
		Date dataRetorno = null;
		try {
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
			dataRetorno = formato.parse(dataDigitada);
		} catch (ParseException e) {
			System.out.println("Data formato incorreta");
		}
		return dataRetorno;
	}
	
	
	public static Date formatarDataFiap2(String dataDigitada) throws ParseException {
		Date dataRetorno = null;
		SimpleDateFormat formato = new SimpleDateFormat("MM/dd/yyyy");
		dataRetorno = formato.parse(dataDigitada);
		return dataRetorno;
	}
	
	
}
