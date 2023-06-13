package com.example.firebase

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.firebase.ui.theme.FirebaseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           GreetingPreview()
        }
    }
}



@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        var text by remember { mutableStateOf(TextFieldValue("")) }
        var mail by remember { mutableStateOf(TextFieldValue("")) }
        var pass by remember { mutableStateOf(TextFieldValue("")) }
//        Box(
//            modifier = Modifier
//                .size(3000.dp)
//                .fillMaxSize(),
//        )
//
//        {
//            Image(
//                painter = painterResource(id = R.drawable.brain1),
//                contentDescription = "abcd"
//            )
//        }


        Text(
            "LOGIN",
            modifier = Modifier


        )
//
//        Image(
//            painter = painterResource(id = R.drawable.profile), contentDescription = "abcd",
//            modifier = Modifier
//                .size(100.dp)
//        )

        OutlinedTextField(
            value = text,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "emailIcon"
                )
            },
            trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                text = it
            },
            label = { Text(text = "Name") },
            placeholder = { Text(text = "Name") },
            colors = TextFieldDefaults.textFieldColors(
                placeholderColor = Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),

            )
        Spacer(
            modifier = Modifier
                .height(15.dp)
        )

        OutlinedTextField(
            value = mail,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Email,
                    contentDescription = "emailIcon"
                )
            },
            trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                mail = it
            },
            label = { Text(text = " Email") },
            placeholder = { Text(text = " Email Address") },
            colors = TextFieldDefaults.textFieldColors(
                placeholderColor = Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),
        )
        Spacer(
            modifier = Modifier
                .height(15.dp)
        )

        OutlinedTextField(
            value = pass,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "emailIcon"
                )
            },
            trailingIcon = { Icon(imageVector = Icons.Default.Add, contentDescription = null) },
            onValueChange = {
                pass = it
            },
            label = { Text(text = " Password") },
            placeholder = { Text(text = "Password") },
            colors = TextFieldDefaults.textFieldColors(
                placeholderColor = Color.White,
                disabledPlaceholderColor = Color.DarkGray
            ),
        )
        Spacer(
            modifier = Modifier
                .height(15.dp)
        )

        Button(
            onClick = {},
            modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),


        colors = ButtonDefaults.buttonColors(Color.DarkGray),
            shape = RectangleShape,


            elevation = ButtonDefaults.buttonElevation(
                defaultElevation = 10.dp,
                pressedElevation = 15.dp,
                disabledElevation = 0.dp,


                )
        ) {
            Text(text = "LOGIN", color = Color.Black, fontStyle = FontStyle.Italic)

        }
    }
}