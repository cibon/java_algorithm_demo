package erik.study.bigTry;

import erik.study.bigTry.lecture.BaseLecture;
import erik.study.bigTry.lecture.Lecture2;

public class BigTry {
	
	private static final int LECTURE_COUNT = 2;

	public static void main(String[] args) {
		Utility.debuglog("start!!");
		BaseLecture lecture = new Lecture2();
		lecture.algorithmRun();

	}

}
