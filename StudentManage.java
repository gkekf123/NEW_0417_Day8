package day08_0417;

import java.util.Arrays;
import java.util.Scanner;

public class StudentManage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		//학생 정보를 등록할 배열을 while문 바깥에 선언
		String [] nameList = new String [100];
		int [] ageList = new int[100];
		String [] infoList = new String [100];
		
		//고객수
		int count = 0;
		//조회할 위치
		int index = -1;
		
		x:while(true) {
			//값이 들어갔나 보기위한 코드
			System.out.println(Arrays.toString(nameList));
			System.out.println(Arrays.toString(ageList));
			System.out.println(Arrays.toString(infoList));
			
			System.out.println("[정보]고객수 : " + count + ", 조회위치 : " + index);
			System.out.println("[메뉴]1.추가, 2.이전정보, 3.다음정보, 4.현재정보, 5.정보수정, 6.정보삭제, 7.종료");
			System.out.println("=====================================");
			System.out.print("메뉴입력 >");
			String menu = sc.next();
		
			switch (menu) {
			case "추가":
			case "1":
					/* 
					 * 이름, 성별, 간단한정보를 입력받아서 각각의 배열에 순서대로 저장될 수 있게 처리
					 * count를 장가
					 */
				System.out.println("이름을 입력 하세요");
				String name = sc.next();
				System.out.println("나이를 입력 하세요");
				int age = sc.nextInt();
				System.out.println("정보를 입력 하세요");
				String info = sc.next();
				
				nameList[count] = name;
				ageList[count] = age;
				infoList[count] = info;
				count++ ;	//count 증가
				
				break;
				
			case "2":
				/*
				 * 이전정보 출력
				 * 정보출력은 index위치로 출력
				 * 이전정보출력을 누르면 index를 -1시키고 해당위치에 정보를 출력
				 * 조건
				 * index가 0보다 작다며, 출력하지 않도록 처리
				 */
				if(index <= 0) {
					System.out.println("이전 정보가 없습니댜");
				} else {
					index --;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("나이 : " + ageList[index]);
					System.out.println("정보 : " + infoList[index]);
				}
				break;
				
			case "3":
				/* 
				 * 다음정보출력
				 * 다음출력은 index위치로 출력
				 * 다음정보출력을 누ㅠ르ㅜ면 index를 +1시키고 해당위치에 정보를 출력
				 * 조건
				 * count-1보다 index가 크다면 출력하지 않도록 처리
				 */
				if(index >= count -1) {
					System.out.println("다음 정보가 없습니다");
				} else {
					index++;
					System.out.println("이름 : " + nameList[index]);
					System.out.println("나이 : " + ageList[index]);
					System.out.println("정보 : " + infoList[index]);
				}
				break;
	
			case "4":
				/*
				 * 현재정보출력
				 * index가 가르키고 있는 위치정보를 출력
				 * 조건
				 * 출력할 수 있는 조건을 생각해서 처리
				 */
				if(index >= 0 && index <= count-1) { //출력이 가능한 조건
					System.out.println("이름 : " + nameList[index]);
					System.out.println("나이 : " + ageList[index]);
					System.out.println("정보 : " + infoList[index]);
				}else {
					System.out.println("현재 위치에 회원정보가 없습니다.");
				}
				break;
	
			case "5":
				/* 
				 * 정보수정
				 * 새로운 이름, 나이, 정보를 입력받아서
				 * 현재 위치를 수정해주면 됩니다.
				 * 조건
				 * 4번과 동일
				 */
				if(index >= 0 && index <= count-1) { //출력이 가능한 조건
					System.out.println(index + "번째 위치를 수정합니다.");
					
					System.out.println("현재 정보 : " + nameList[index] + ">");
					nameList[index] = sc.next();
					
					System.out.println("현재 정보 : " + ageList[index] + ">"); 
					ageList[index] = sc.nextInt();
				
					System.out.println("현재 정보 : " + infoList[index] + ">");
					infoList[index] = sc.next();
				} else {
					System.out.println("현재 위치에 수정할 정보가 없습니다.");
				}
				break;
	
			case "6":
				/* 
				 * 현재정보 삭제
				 * 현재 삭제하려는 index부터 뒤에 있는 배열요소를 
				 * 당겨와서 덮어 씌운다
				 * 사람 수를 감소
				 * 조건
				 * 4번과 동일
				 */
				if(index >= 0 && index <= count-1) { //삭제 가능 조건
					
					System.out.println(nameList[index] + "님 정보가 삭제되었습니다.");
					
					for(int i = index; i < count -1; i++) {
						nameList[i] = nameList[i + 1];
						ageList[i] = ageList[i + 1];
						infoList[i] = infoList[i + 1];
					}
					count --;	//사람 수룰 하나 줄여서 마치 삭제한 것 처럼 처리
				} else {
					System.out.println("현재 위치에 삭제할 정보가 없습니다");
				}
				break;
	
			case "7":
				 //while문의 탈출
				System.out.println("프로그램을 종료합니다");
				break x; 

			default:
				System.out.println("숫자를 잘못 입력하셨습니다.");
				break;
			}
			
		}
		
		
		
	}

}
