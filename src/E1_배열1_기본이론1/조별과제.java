//// [회원정보]
//// [아이디,이름,비밀번호,생년월일,이메일,전화번호,회원주소,가입일,성별,등급]
//{ "7369", "SMITH", "CLERK", "7902", "17-12-1980", "800", "0", "20", "0", "1"},
//{ "7499", "ALLEN", "SALESMAN", "7698", "20-2-1981", "1600", "300", "30", "1", "1" },
//{ "7521", "WARD", "SALESMAN", "7698", "22-2-1981", "1250", "500", "30", "0", "2" },
//{ "7566", "JONES", "MANAGER", "7839", "2-4-1981", "2975", "0", "20", "1", "2" },
//{ "7654", "MARTIN", "SALESMAN", "7698", "28-9-1981", "1250", "1400", "30", "0", "3" },
//{ "7698", "BLAKE", "MANAGER", "7839", "1-5-1981", "2850", "0", "30", "1", "3" },
//{ "7782", "CLARK", "MANAGER", "7839", "9-6-1981", "2450", "0", "10", "0", "4" },
//{ "7788", "SCOTT", "ANALYST", "7566", "13-7-1987", "3000", "0", "20", "1", "4" },
//{ "7839", "KING", "PRESIDENT", "NULL", "17-11-1981", "5000", "0", "10", "0", "4" },
//{ "7844", "TURNER", "SALESMAN", "7698", "8-9-1981", "1500", "0", "30", "1", "5" },
//{ "7876", "ADAMS", "CLERK", "7788", "13-7-1987", "1100", "0", "20", "0", "5" },
//{ "7900", "JAMES", "CLERK", "7698", "3-12-1981", "950", "0", "30", "1", "5" },
//{ "7902", "FORD", "ANALYST", "7566", "3-12-1981", "3000", "0", "20", "0", "5" },
//{ "7934", "MILLER", "CLERK", "7782", "23-1-1982", "1300", "0", "10", "1", "5" }
//
////[영화정보]
////[영화이름, 상영날짜, 시간, 좌석, 지점, 관, 예매 인원수, 성별, 등급,]
//{범죄도시2, 2022-05-30, 08:00, ,320, 신림, 1관, 3, 남 : 2, 여: 1,//1등급 : 1,  2등급 : 1,  5등급 : 1}
//{범죄도시2, 2022-05-30, 08:00, ,320, 신림, 3관, 2 남 : 1, 여: 1//1등급 : 1,  3등급 : 1,}	
//{닥터스트레인지, 2022-05-30, 08:30, ,240, 신림, 2관, 3 남 : 1, 여: 2//2등급 : 1, 4등급 : 1, 5등급 : 1}
//{브로커, 2022-05-30, 08:30, ,240, 신림, 4관, 2 남 : 1, 여: 1//3등급 : 1, 5등급 : 1}
//{쥬라기, 2022-05-30, 08:30, ,240, 신림, 5관, 2 남 : 1, 여: 1//4등급 : 1 5등급 : 1}
//{포켓몬스터 극장판, 2022-05-30, 08:30, ,240, 신림, 6관, // 2 남 : 1, 여: 1}
//
//{마녀, 2022-06-13, 08:30, ,240, 신림, 2관}
//{탑건, 2022-06-20, 08:30, ,240, 신림, 1관}
//{버즈 라이트이어, 2022-06-27, 08:30, ,240, 신림, 3관}
//														
//// [회원등급] - // 영화 티켓 예매 횟수에 따른 등급 측정
//// [등급 , 월관람횟수, 영화할인권 ] [1 - 영화 10% 할인권 5장] [2 - 영화 10% 할인권 3장] [3 - 영화 10% 할인권 2장] [4 - 영화 10% 할인권 1장]
//
//{ 1, 10,5 }, // 1등급 =  월 10회 이상 관람 회원 = 영화할인권
//{ 2, 7, 3 },  // 2등급 = 월 7회 이상 = 영화할인권
//{ 3, 3, 2  },  // 3등급 = 월 5회상 = 영화할인권
//{ 4, 3, 1  }, // 4등급 = 월 3회상 = 영화할인권
//{5, 0, 0}	//5등급 = 일반회원 = 영화할인권
