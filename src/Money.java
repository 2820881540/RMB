public class Money {
	int yuan, jiao, fen;

	public Money(int yuan, int jiao, int fen) {
		super();
		this.yuan = yuan;
		this.jiao = jiao;
		this.fen = fen;
	}
	
	public Money(double figure) {
		yuan = (int)figure;
		jiao = (int)((figure%1) * 10);
		fen = (int)(((figure%1) * 100)%10 + 0.5);	//因为进制转换原理问题，部分小数无法在计算机中精确存储
	}

	public String toString() {
		return yuan + "元" + jiao + "角" + fen + "分";
	}
	
	public void add(double addFigure) {
		yuan =+ (int)addFigure;
		jiao =+ (int)((addFigure%1) * 10);
		fen =+ (int)(((addFigure%1) * 100)%10 + 0.5);
	}
	
	public void add(Money m) {
		this.yuan += m.yuan;
		this.jiao += m.jiao;
		this.fen += m.fen;
		
		proofread();
	}
	
	private void proofread() {
		if (fen >= 10) {
			this.fen %= 10;
			this.jiao += 1;
		}
		if (jiao >= 10) {
			this.jiao %= 10;
			this.yuan += 1;
		}
		
	}

	public void cut(Money m) {
		this.yuan -= m.yuan;
		this.jiao -= m.jiao;
		this.fen -= m.fen;
		
		proofread();
		
	}
	
}

