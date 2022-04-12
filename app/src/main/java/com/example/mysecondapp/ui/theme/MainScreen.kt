package com.example.mysecondapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.textInputServiceFactory
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mysecondapp.ui.theme.Purple200
import com.example.mysecondapp.ui.theme.Purple200


@Preview
@Composable
fun myApp(){
    Box (modifier = Modifier
        .fillMaxSize()
        .background(color = Purple200)
        .padding(15.dp)
    )
    {   myHeader()
        myLeftScreen()
    }
}

@Composable
fun myHeader() {
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Text(
            text = "Welcome to Online Portal",
            fontWeight = FontWeight.Bold,
            fontSize = 22.sp,
            modifier = Modifier
                .align(CenterHorizontally)
        )
        Text(
            text = "This is to check the details",
            fontSize = 15.sp,
            modifier = Modifier
                .align(CenterHorizontally)
        )
        Text(
            text = "--------------------------------------------------",
            modifier = Modifier
                .align(CenterHorizontally)
        )
    }
}

@Composable
fun myLeftScreen(){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                //                .padding(70.dp)
                .size(180.dp, 300.dp)
        ){
            Text(
                text = "Technical Books",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Daily Magazines",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Sunday Magazines",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Other Magazines",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
        Column (
            verticalArrangement = Arrangement.Center,
            modifier = Modifier
                //                .padding(70.dp)
                .size(180.dp, 250.dp)
        ){
            Text(
                text = "Business Articles",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Daily Articles",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Sunday Articles",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
            Text(
                text = "Other Articles",
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        }
    }
}