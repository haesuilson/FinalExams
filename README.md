## **앱개발기초 기말고사 보고서**
### **2021661054 손해슬**
제가 만든 프로그램은 주사위 시뮬레이션입니다.
이 프로그램은 주사위 대신 굴리고, 기록이 남고, 주사위 눈을 사용자가 확인할 수 있고, 다시 굴렸을 때도 남도록	 만들었습니다.

#### 랜덤 클래스를 사용해서 1~6사이의 숫자가 랜덤으로 나올 수 있도록 설정을 했고,
```java
int diceNUM = 0;
Random dicerandom = new Random();
diceNUM = dicerandom.nextInt(6)+1;
```
#### 리사이클러뷰와 카드뷰, 어래이리스트를 통해 사용자가 버튼을 눌러서 숫자가 나오면 그 숫자를 저장하도록 만들었습니다.
```java
button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int diceNUM = 0;
                Random dicerandom = new Random();
                diceNUM = dicerandom.nextInt(6)+1;

                dicetext.setText(String.valueOf(diceNUM));

                addItem("->" + diceNUM, "주사위 눈");
                mDiceAdater.notifyItemChanged(0);


            }
        });

```
#### 그래서 리사이클러뷰를 사용할 때 필요한 리사이클러뷰, 어댑터, 레이아웃매니저, 뷰홀더를 만들었습니다.
```java
<androidx.recyclerview.widget.RecyclerView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/recyclerView" />
```
제가 이 프로그램을 만든 이유는 친구들과 놀다가 가끔 벌칙, 내기 등 흥미를 줄 수 있는 요소에서 주사위를 굴리는 것만큼 공평하고 재밌는게 없는데 일반적으로 주사위를 들고 다닐 일이 없기 때문에 주사위 대신 프로그램을 만들면 좋겠다고 생각해서 이 프로그램을 만들었습니다.


데이터베이스를 통해 사용자가 뽑은 주사위 눈이 저장되도록 만들 수 있었지만 그렇게 만드면 다음번에 이 앱을 사용할 때 번거로울 것 같아서 데이터베이스는 추가하지 않았습니다.
