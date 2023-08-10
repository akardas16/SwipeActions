# SwipeActions-Jatpack-Compose

## Showcases


<p align="center">
 <img src="https://github.com/akardas16/SwipeActions/assets/28716129/274c6c51-9fd7-4952-a79f-8ccb0ec0fa68" width="35.7%">
<img src="https://github.com/akardas16/SwipeActions/assets/28716129/374b02e9-7880-4311-928c-b31cf99bb7f7" width="22.7%" >
 <img  src="https://github.com/akardas16/SwipeActions/assets/28716129/3f21d40f-fcb4-4710-b3af-4605a8997fe3" width="36.3%" >
</p>

## Install

* Add `SwipeActions.kt` and `SwipeActionModel.kt` files to your project

## Basic Usage


```Kotlin
val viewModel: SwipeActionModel = SwipeActionModel()
SwipeActionsRight(modifier = Modifier // or SwipeActionsLeft
            .fillMaxWidth(0.95f)
            .height(100.dp), viewModel = viewModel,
            actionOneClicked = {}, actionTwoClicked = {}) {
            Column(modifier = Modifier.fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceAround) {


                Text(text = "For more options, swipe the card", color = Color.Black,
                    fontSize = 16.sp,  fontFamily = FontFamily(Font(R.font.lato_regular))
                )
            }
        }
```

*  Toggle / Extend / Collapse 

```Kotlin
viewModel.toggleSwipe() //switch status

viewModel.expand() //open

viewModel.collapse() //close
```

*  Available parameters

  ```Kotlin
modifier: Modifier = Modifier,
                      viewModel: SwipeActionModel, numberOfActions:Int = 2,
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
* See `MainActivity.kt`

*Inspired from https://github.com/aheze/SwipeActions
