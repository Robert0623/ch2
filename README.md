# ch2
## git strategy
1. 깃허브사이트에서 main, dev브랜치 생성
2. 로컬 dev브랜치 생성 후 커밋
3. 로컬 main과 머지
4. 로컬에서 원격으로 푸쉬

## 06.06
- 인텔리제이 연동 후 스프링 ch2-1 ~ ch2-10까지 학습내용 commit, push.

## 06.07
- 인텔리제이에서 commit, reset, revert, undo 등 테스트 하다 꼬여서 ch2 repo 삭제.
- 다시 인텔리제이에서 깃허브 연동 후 ch2-1 ~ ch2-9 내용 dev브랜치로 commit만 함.
- 이번엔 STS에서 깃허브 연동 후 ch2-1 ~ ch2-17까지 학습내용 commit, push.
- conflicts 발생해서 비교화면에서 최신내용으로 수정 후 충돌해결.

## 06.08
- 어제까지 내용 깃허브 홈페이지에서 readme작성.
- STS에서 오전에 ch2-18 ~ ch2-21 학습한 내용을 로컬dev에 commit, 로컬dev와 로컬main을 merge, 로컬에서 원격 dev와 main에 push.
- 로컬에서 원격 dev로는 push됐지만, 원격 main으로는 푸쉬가 rejected됨.
- 구글링 검색 후 force로 작업. 
- head 및 모든 브랜치가 동기화 됐지만 깃허브 사이트에 readme파일 사라짐.
- readme파일 다시 작성.
- 깃허브 사이트의 main브랜치에 readme를 작성했는데, STS에서 rejected된 것을 force로 밀어버려서 사라졌다고 예상됨. 
- readme 작성 후 STS에서 readme를 pull 하고, ch2-22 ~ ch2-26 로컬 dev 커밋, 로컬 main과 merge, 원격 dev, main에 푸쉬하니 충돌 없이 잘 되었음.

## 06.09
- STS에서 ch2-26 ~ ch2-29 학습한 내용 어제와 똑같이 commit, merge, push. 
- web.xml, servlet-context.xml 등 수정한 파일이 있지만, 그 소스 파일의 위 또는 아래에 복사하니 conflicts 없었음.
- local dev, local main, origin dev, origin main 4개의 branch가 동기화 되면서 commit되게 하는 중.
- readme 수정 후, STS에서 pull 할 예정.
