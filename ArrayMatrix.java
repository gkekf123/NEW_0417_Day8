package day08_0417;

import java.util.Arrays;

public class ArrayMatrix {

	public static void main(String[] args) {
		
		// 다차원배열 - 매트릭스
		// 배열안에 배열이 저장되는 형태
		// int[][]
		
		int [] kor = {10,20,30};
		int [] math = {40,50,60};
		int [] eng = {70,80,90};
		
		int[][]	arr = {kor, math, eng};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr[0]));
		System.out.println(Arrays.toString(arr[1]));
		System.out.println(Arrays.toString(arr[2]));
		
		// 2차원 배열의 사용
		System.out.println(arr[0][0]);	//arr[0](세로열 - 앞'0'배열은 kor[0]과 같은 의미), [0](가로열 - 뒤 '0'배열은 kor[0] 의 0번째 인덱스)
		arr[0][0] = 100;
		System.out.println(arr[0][0]);	//arr[0](세로열), [0](가로열
		
		// 1. 2차원 배열을 한번에 생성하고, 초기화하는 방법
		int[][] arr2 = {
				{10, 20, 30},
				{40, 50, 60},
				{70, 80, 90}
		};
		
		// 2. 2차원 배열의 크기만 지정하는 방법
		int[][] arr3 = new int[3][4];	//3행 4열	
		
		
		// 2차원 배열 모형을 한번에 보는방법
		System.out.println(Arrays.deepToString(arr3));
		
		// 2차원 배열의 순회
		int x = 1;
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = x++;
				}
			}
		System.out.println(Arrays.deepToString(arr3));
		
		
		
	}	
}
