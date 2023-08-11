#  Jatpack-Compose / SwipeActions

## Showcases


<p align="center">
 <img src="https://github.com/akardas16/SwipeActions/assets/28716129/274c6c51-9fd7-4952-a79f-8ccb0ec0fa68" width="35.7%">
<img src="https://github.com/akardas16/SwipeActions/assets/28716129/374b02e9-7880-4311-928c-b31cf99bb7f7" width="22.7%" >
 <img  src="https://github.com/akardas16/SwipeActions/assets/28716129/3f21d40f-fcb4-4710-b3af-4605a8997fe3" width="36.3%" >
</p>

## Install

* Add [`SwipeActions.kt`](https://github.com/akardas16/SwipeActions/blob/main/app/src/main/java/com/example/swipeactions/SwipeActions.kt)  file to your project

## Basic Usage


```Kotlin
 var isExpanded by remember { mutableStateOf(false) }

 SwipeActionsRight(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(100.dp), 
            isExpanded = isExpanded, onChangedCard = { isExpanded = it }) {
            Row(modifier = Modifier  //Your Custom UI
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {
                    Text(
                        text = "Swipe Actions", color = Color.Black,
                        fontSize = 18.sp, fontFamily = FontFamily(Font(R.font.lato_bold))
                    )

                    Text(
                        text = "For more options, swipe the cardddd", color = Color.Black,
                        fontSize = 16.sp, fontFamily = FontFamily(Font(R.font.lato_regular))
                    )
                }

            }
        }
```

*  Toggle / Extend / Collapse 

```Kotlin
isExpanded = !isExpanded //switch status

isExpanded = true //open

isExpanded = false //close
```

*  Available parameters

  ```Kotlin
modifier: Modifier = Modifier,
                      isExpanded:Boolean, numberOfActions:Int = 2,
                      onChangedCard:(isExpanded:Boolean) -> Unit,
                      type: Type = Type.Icon, iconPadding: Dp = 29.dp,
                      cornerRadius: Dp = 24.dp, itemWidth: Dp = 100.dp,
                      actionOneColor: Color = Color.Red, actionTwoColor: Color = Color.White,
                      actionOneText: String = "Delete", actionTwoText: String = "Mail",
                      actionOneImage: ImageVector = Icons.Rounded.Delete,
                      actionTwoImage: ImageVector = Icons.Default.Mail,
                      actionOneBackColor: Color = Color(0x5EA5A3A3),
                      actionTwoBackColor: Color = Color(0x5EA5A3A3),
                      cardBackground:Color = Color(0xFFCACACE),
                      actionOneClicked:() -> Unit = {}, actionTwoClicked:() -> Unit = {}
```


### Want to see showcase?
* See  [`MainActivity.kt`](https://github.com/akardas16/SwipeActions/blob/main/app/src/main/java/com/example/swipeactions/MainActivity.kt) for some examples

* Inspired from https://github.com/aheze/SwipeActions
