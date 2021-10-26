package custom_exception;

import custom_exception.exception.*;

public class Thermostat {
	
	public void setTemperature(double temperature) throws TempOutOfRangeException {
		
		if(temperature < 0 || temperature > 35) {
			//온도값이 비정상으로 여겨서 예외처리한다. threow는 일단 예외를 나중에 처리
			throw new Exception("온도가 비정상 입니다."); 
			
			//setTemperature 메소드에서 예외처리를 throw했기 때문에 호출할때 처리해야 한다. 
			//try-catch는 바로 처리, throw는 넘김
			
		}
		System.out.println("온도 세팅: "+temperature);//온도가 정상일 경우 출력
	}

}
