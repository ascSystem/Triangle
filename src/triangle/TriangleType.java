package triangle;

public enum TriangleType {
	EquilateralTriangle{
		@Override
		public String toString(){
			return "正三角形";
		}
	},
	IsoscelesTriangle{
		@Override
		public String toString(){
			return "2等辺三角形";
		}
	},
	ScaleneTriangle{
		@Override
		public String toString(){
			return "不等辺三角形";
		}
	},
	NotTriangle{
		@Override
		public String toString(){
			return "三角形ではない";
		}
	}
}
