# Exception
## 예외 종류
	1. 일반 컴파일 예외(Exception) : 컴파일이 되지 않는 예외
	2. 실행예외 (RuntimeException) : 실행하다가 발생할 수 있는 예외

## 실행예외
- NullPointException
	객체 참조가 없는 상태.
- ArrayIndexOutBoundsException
	배열에서 인덱스 범위를 초과하여 사용할 경우 발생됨.
- NumberFormatException
	문자열을 숫자로 변환 화면서 생기는 오류
- ClassCastException
	클래스의 타입변환이 할 수 없을때 발생된다.(상속등등…)

## 예외 처리 코드
- 예외가 발생하면 프로그램 종료를 막고 정상 실행을 유지할 수 있도록 처리하는코드
	ex) Try~Catch~Finaly


