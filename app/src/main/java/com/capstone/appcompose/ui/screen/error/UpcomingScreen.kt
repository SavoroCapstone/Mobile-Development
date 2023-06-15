package com.capstone.appcompose.ui.screen.error

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.capstone.appcompose.R
import com.capstone.appcompose.ui.theme.GreenSavoro

@Composable
fun UpcomingScreen(
    navController: NavController
){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
    ) {
        Spacer(modifier = Modifier.height(80.dp))
        Image(
            painter = painterResource(id = R.drawable.comingsoon),
            contentDescription = null,
            modifier = Modifier
                .height(250.dp)
                .width(250.dp)
        )
        Text(
            text = "This feature is\ncoming soon",
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h4.copy(fontSize = 16.sp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
        )
        Text(
            text = "Don't miss out\n \n \n",
            color = Color.Gray,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .padding(top = 10.dp),
        )
        Spacer(modifier = Modifier.height(36.dp))
        Button(
            modifier = Modifier
                .fillMaxWidth()
                .height(42.dp),
            onClick ={
                navController.popBackStack()
            },
            colors = ButtonDefaults.buttonColors(
                backgroundColor = GreenSavoro
            ),
            shape = RoundedCornerShape(9.dp),
        ){
            Text(
                text = "Back",
                fontSize = 14.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold
            )
        }
    }
}