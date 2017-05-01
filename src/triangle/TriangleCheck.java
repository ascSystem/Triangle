package triangle;

import static triangle.TriangleType.*;

public class TriangleCheck {
	/**
	 * 辺の長さを示す引数３つから三角形が
	 * 不等辺三角形、ニ等辺三角形、正三角形のうちのどれで
	 * あるかを示す値を戻り値として返します。
	 * @param acm
	 * @param bcm
	 * @param ccm
	 * @return
	 */
	public static TriangleType check(int acm,int bcm,int ccm){
		TriangleType type;
		int max1 = Math.max(acm,Math.max(bcm, ccm));
		int max2 = second(acm,bcm,ccm);
		int max3 = Math.min(acm,Math.min(bcm, ccm));
		if((max1 >= max2 + max3)){
			type = NotTriangle;
		}else if((acm==bcm)&&(bcm==ccm)){
			type = EquilateralTriangle;
		}else if((acm==bcm)||(bcm==ccm)||(acm==ccm)){
			type = IsoscelesTriangle;
		}else{
			type = ScaleneTriangle;
		}
		return type;
	}
	public static int second(int acm,int bcm, int ccm){
		int max = Math.max(acm,Math.max(bcm, ccm));
		int min = Math.min(acm,Math.min(bcm, ccm));
		if(((acm<max)&&(acm>min))||(acm==bcm)||(acm==ccm))
				return acm;
		else if(((bcm<max)&&(bcm>min))||(bcm==acm)||(bcm==ccm))
			return bcm;
		else
			return ccm;
	}
}
