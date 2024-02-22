이번에 드디어 디자인패턴(mvvm)을 기반으로 새로운 앱을 개발하게 되었다.

이번 프로젝트의 목표는 기존에 우리가 갖고있는 sdk를 연결하여 금융앱에서 권한을 동의하는 화면을 만들고 권한을 동의하면 사용자의 핸드폰에 있는 데이터를 전송하는 프로젝트이다. 

간단하다고 생각되지만 그래도 처음 코틀린을 사용하여 만드는 프로젝트이다보니 배운다는 생각으로 임해야겠다.

## 스택

언어 : kotlin 1.9.0 version

빌드 도구 : gradle 8.0

프레임워크 : Android Studio

### 사용할 디자인 패턴

mvvm패턴

## 오늘 진행 상황

어플 intro Activity를 제외하고 프론트 단을 만듦
![Untitled](https://prod-files-secure.s3.us-west-2.amazonaws.com/80c639bf-7705-46a5-b266-2f9f80c7e992/53e67b78-70be-4daa-a372-c59a8aa3231b/Untitled.png)

https://prod-files-secure.s3.us-west-2.amazonaws.com/80c639bf-7705-46a5-b266-2f9f80c7e992/53e67b78-70be-4daa-a372-c59a8aa3231b/Untitled.png

https://prod-files-secure.s3.us-west-2.amazonaws.com/80c639bf-7705-46a5-b266-2f9f80c7e992/db539264-626a-48af-8509-8f995c0fee86/Untitled.png


## 개발하며 고려사항

- 첫번째 화면에서 permission을 얻어오는 부분은 ppc bank에서 어떤 권한을 필요로 할지몰라 우리가 갖고있는 sdk에서 가져올수있는 데이터들의 총 권한 그룹을 적어뒀음 (총 8개)

## issue

- loding bar를 어떻게 구성할까 생각해봤음..
    - 다운로드도 아니고 전송시간도 불정확하기 떄문에 완료시간을 몰라 progressbar가 아닌 그냥 반복되는 gif로 하려고 함.
    - 하지만 gif는 android studio에서 지원이 안되기에 drawable에 gif의 프레임단위를 png로 추출하여 animation-list에 붙여넣음
    
    https://prod-files-secure.s3.us-west-2.amazonaws.com/80c639bf-7705-46a5-b266-2f9f80c7e992/1c5b30fc-c132-4dd0-8225-dba39f5beef6/Untitled.png

    https://prod-files-secure.s3.us-west-2.amazonaws.com/80c639bf-7705-46a5-b266-2f9f80c7e992/e67064b5-2adb-410d-a681-1f7deaef0a5f/ppcbank-dev__frame_loding.xml_ppcbank-dev.app.main_2024-02-21_17-55-57.gif
