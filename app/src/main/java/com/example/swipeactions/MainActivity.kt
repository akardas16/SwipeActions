package com.example.swipeactions

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.gestures.rememberDraggableState
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.PressInteraction
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxScope
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.LightMode
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.rounded.Delete
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.swipeactions.R
import com.example.swipeactions.ui.theme.SwipActionsTheme
import kotlin.math.roundToInt

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SwipActionsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Examples()
                }
            }
        }
    }
}

@Composable
fun Examples(viewModel: SwipeActionModel = SwipeActionModel()){

    // val isExpand by viewModel.isExpand.collectAsStateWithLifecycle()

    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround, horizontalAlignment = Alignment.CenterHorizontally) {

        SwipeActionsRight(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(100.dp),viewModel = viewModel,numberOfActions = 1,
            actionOneImage = Icons.Default.Share, actionOneColor = Color(0xFF005EFF)
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalArrangement = Arrangement.Center) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {
                    Text(text = "Swipe to share", color = Color.Black,
                        fontSize = 18.sp,  fontFamily = FontFamily(Font(R.font.lato_bold))
                    )

                }

            }
        }

        SwipeActionsRight(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(100.dp),viewModel = viewModel){
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {
                    Text(text = "Swipe Actions", color = Color.Black,
                        fontSize = 18.sp,  fontFamily = FontFamily(Font(R.font.lato_bold))
                    )

                    Text(text = "For more options, swipe the card", color = Color.Black,
                        fontSize = 16.sp,  fontFamily = FontFamily(Font(R.font.lato_regular))
                    )
                }

                Icon(imageVector = Icons.Default.LightMode, contentDescription = null,
                    modifier = Modifier.fillMaxHeight(), tint = Color.Gray)

            }
        }

        SwipeActionsLeft(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(60.dp),viewModel = viewModel,
            iconPadding = 16.dp, actionOneImage = Icons.Default.Add,
            actionOneColor = Color.Black
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {


                    Text(text = "For more options, swipe the card", color = Color.Black,
                        fontSize = 16.sp,  fontFamily = FontFamily(Font(R.font.lato_regular))
                    )
                }



            }
        }

        SwipeActionsLeft(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(60.dp),viewModel = viewModel,
            iconPadding = 16.dp, actionOneImage = Icons.Default.Add,
            actionOneColor = Color.White, numberOfActions = 1,
            actionOneBackColor = Color(0xFF0071E9)
        ){
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {


                    Text(text = "For more options, swipe the card", color = Color.Black,
                        fontSize = 16.sp,  fontFamily = FontFamily(Font(R.font.lato_regular))
                    )
                }



            }
        }

        SwipeActionsRight(modifier = Modifier
            .fillMaxWidth(0.95f)
            .height(100.dp),viewModel = viewModel, type = Type.Text){
            Row(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(15.dp),
                horizontalArrangement = Arrangement.SpaceAround) {
                Column(modifier = Modifier.fillMaxHeight(),
                    verticalArrangement = Arrangement.SpaceAround) {
                    Text(text = "Swipe Actions", color = Color.Black,
                        fontSize = 18.sp,  fontFamily = FontFamily(Font(R.font.lato_bold))
                    )

                    Text(text = "For more options, swipe the card", color = Color.Black,
                        fontSize = 16.sp,  fontFamily = FontFamily(Font(R.font.lato_regular))
                    )
                }

                Icon(imageVector = Icons.Default.LightMode, contentDescription = null,
                    modifier = Modifier.fillMaxHeight(), tint = Color.Gray)

            }
        }

        Surface(modifier = Modifier
            .fillMaxWidth(0.4f)
            .height(42.dp)
            .bounceClick {
                viewModel.toggleSwipe()
            }, shape = RoundedCornerShape(50), color = Color.Gray
        ) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center) {
                Text(text = "Switch", color = Color.White,
                    fontWeight = FontWeight.Bold, fontSize = 16.sp)
            }
        }

    }
}







@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SwipActionsTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Examples()
        }
    }
}