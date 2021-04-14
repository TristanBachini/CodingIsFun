import java.math.BigDecimal;
import java.math.RoundingMode;


public class ScientificNotation {
	double number;
	double numberCopy = number;
	int precision = 2;
	int raisedTo=0;
	
	public ScientificNotation(double number) {
		this.number = number;
		numberCopy = number;
		if(number > 0) {
			if(number>=10) {
				while(number >=10) {
					this.number /=10;
					number /=10;
					raisedTo +=1;
				}
			}
			if(number<1) {
				while(number<1) {
					this.number*=10;
					number *=10;
					raisedTo -=1;
				}
			}
		}
		else {
			if(number<=-10) {
				while(number < -10) {
					this.number /=10;
					number /=10;
					raisedTo+=1;
				}
			}
			if(number<0 && number > -1) {
				this.number*=10;
				number *=10;
				raisedTo -=1;
			}
			
		}
	}
	
	
	public void setPrecision(int precision) {
		this.precision = precision;
	}
	
	public Object add(ScientificNotation sn) {
		ScientificNotation sn9= new ScientificNotation(this.numberCopy+sn.numberCopy);
		if(sn.precision > this.precision) {
			sn9.precision = sn.precision;
		}
		else {
			sn9.precision = this.precision;
		}
		return sn9;
	}
	
	public Object subtract(ScientificNotation sn) {
		
		ScientificNotation sn9 = new ScientificNotation(this.numberCopy-sn.numberCopy);
		
		if(sn.precision > this.precision) {
			sn9.precision = sn.precision;
		}
		else {
			sn9.precision = this.precision;
		}
		return sn9;
		
	}
	
	public Object multiply(ScientificNotation sn) {
		ScientificNotation sn9 = new ScientificNotation(sn.numberCopy*this.numberCopy);
		if(sn.precision > this.precision) {
			sn9.precision = sn.precision;
		}
		else {
			sn9.precision = this.precision;
		}
		return sn9;
	}
	
	public Object divide(ScientificNotation sn) {
		ScientificNotation sn9 = new ScientificNotation(this.numberCopy/sn.numberCopy);
		if(sn.precision > this.precision) {
			sn9.precision = sn.precision;
		}
		else {
			sn9.precision = this.precision;
		}
		return sn9;
	}
	
	public int getSignificantFigures() {
		int sigFig = 0;
		int numberCopyInt = (int)numberCopy;
		while(numberCopy - numberCopyInt !=0) {
			numberCopy = numberCopy*10;
			numberCopyInt = (int)numberCopy;
		}
		int newNumber = (int)numberCopy;
		while(newNumber>0) {
			newNumber/=10;
			sigFig+=1;
		}
		
		return sigFig;
	}

	
	public String toString() {
		
		if(precision >0) {
			BigDecimal bd = new BigDecimal(Double.toString(number));
		    bd = bd.setScale(precision, RoundingMode.HALF_UP);
		    String k = bd.toString()+"x10^"+raisedTo;
		    return k;
		}
		else {
			int numberToPrint = (int)number;
			StringBuilder m = new StringBuilder();
			m.append(numberToPrint+"x10^"+raisedTo);
			String k = m.toString();
			return k;
		}
	}

}
