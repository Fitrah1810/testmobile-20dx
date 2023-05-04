package com.uti.pjetpack20dx

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.PJetpack20DXTheme

class IOActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //BUAT VARIABEL UNTUK OBJEK
                    var txt_nilai1 by remember {
                        mutableStateOf("")
                    }
                    //BUAT COLUMN 
                    Column(modifier = Modifier.padding(10.dp)) {
                        //BUAT INPUT 1
                        OutlinedTextField(label = {
                          Text(text = "Isi Nilai 1")
                        }, value = txt_nilai1, onValueChange = {
                                                   txt_nilai1 = it
                        }, modifier = Modifier.fillMaxWidth(), colors = TextFieldDefaults.textFieldColors(focusedIndicatorColor = Color.Blue, containerColor = Color.Transparent, focusedLabelColor = Color.Yellow, cursorColor = colorResource(
                            id = R.color.ungyu
                        )))
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    PJetpack20DXTheme {
     //   Greeting2("Android")
    }
}