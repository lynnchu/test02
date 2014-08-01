import java.math.BigDecimal;


public class BigDecimalDemo {

	static final int location = 10;
	public BigDecimal add(double value1, double value2){
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2= new BigDecimal(Double.toString(value2));	
		return b1.add(b2);
	}
	
	public BigDecimal sub(double value1, double value2){
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2= new BigDecimal(Double.toString(value2));	
		return b1.subtract(b2);
	}		
	
	public BigDecimal mul(double value1, double value2){
		BigDecimal b1 = new BigDecimal(Double.toString(value1));
		BigDecimal b2= new BigDecimal(Double.toString(value2));	
		return b1.multiply(b2);
	}
	public BigDecimal div(double value1,double value2){
		return div(value1,value2,location);
	}
	public BigDecimal div(double value1, double value2, int b){
		if(b<0){
			System.out.println("b值必须大于等于0");
		}
		BigDecimal b1 = new BigDecimal(value1);
		BigDecimal b2 = new BigDecimal(value2);
		return b1.divide(b2, b, BigDecimal.ROUND_HALF_UP);
			
		}
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BigDecimalDemo b = new BigDecimalDemo();
		System.out.println(b.add(-7.5, 8.9));
		System.out.println(b.sub(-7.5, 8.9));
		System.out.println(b.mul(-7.5,8.9));
		System.out.println(b.div(10,2,location));
		System.out.println(b.div(-7.5, 8.9,2));
	}

}
