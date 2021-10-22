# FileIO_practice

## 파일 입출력

### 1. 텍스트 파일 읽어오기 

<ol> 1)FileReader </ol>

- 형식 FileReader(File file)
- 캐릭터 파일을 읽을 수 있는 기능 제공
- 메소드 
  + read(): 한글자씩 읽어서 int형 숫자를 return(char로 형 변환 시 문자)더 이상 글자가 없을시 -1 return 
    
<ol> 2)BufferReader </ol>

- buffer란 ? 
: 임시 저장 공간 , CPU와 보조기억장치에서 사용되는 임시 저장 공간 
- 형식 BufferReader(Reader in) : 파라미터는 Reader 객체(FileReader/InputStreamReader)을 전달 
- 메소드
+ readline(): 텍스트 파일을 한줄 씩 읽어서 String형으  return, 더 이상 읽을 내용 없을 시 null return 