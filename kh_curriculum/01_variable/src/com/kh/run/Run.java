package com.kh.run;

import com.kh.variable.*;

public class Run {

	public static void main(String[] args) {
		A_Variable av = new A_Variable();
//		av.declareVariable();
//		av.initVariable();
		
		B_KeyboardInput bk = new B_KeyboardInput();
//		bk.inputScanner2();
		
		C_Constant cc = new C_Constant();
//		cc.finalConstant();
		
		D_Overflow dov = new D_Overflow();
//		dov.overflow();
		
		F_Cast fc = new F_Cast();
//		fc.rule1();
//		fc.rule2();
//		fc.dataLoss();
		G_Printf gp = new G_Printf();
		gp.printMethid();
		
	}
}

