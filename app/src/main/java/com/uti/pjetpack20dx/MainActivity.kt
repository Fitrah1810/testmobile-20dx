package com.uti.pjetpack20dx

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.uti.pjetpack20dx.ui.theme.PJetpack20DXTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PJetpack20DXTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //Greeting("Android")
                    //Text(text = "Saya Belajar Jetpack Compose")
                    //Button(onClick = { /*TODO*/ }) {

                    //}
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color.LightGray)
                            .padding(10.dp)
                    ) {

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Yellow)
                                .padding(10.dp)
                        ) {
                            // Greeting("Android")
                        }
                        //SPACER SAMA DENGAN MARGIN
                        Spacer(modifier = Modifier.padding(10.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .padding(10.dp)
                        ) {
                            Text(text = "Saya Belajar Jetpack Compose")
                        }
                        //SPACER SAMA DENGAN MARGIN
                        Spacer(modifier = Modifier.padding(10.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.Blue)
                                .padding(10.dp)
                        ) {
                            Text(text = "Saya Belajar Jetpack Compose lagi")
                        }
                        //SPACER SAMA DENGAN MARGIN
                        Spacer(modifier = Modifier.padding(10.dp))

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .background(Color.White)
                                .padding(10.dp)
                        ) {


                            var x = "10"
                            var y = "3"
                            val z = x.toFloat() / y.toInt()

//                              buat variabel context
                            val context = LocalContext.current
                            //                            memasukan properties modifier
                            Button(
                                modifier = Modifier.fillMaxWidth(),
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = Color.Cyan,
                                    contentColor = Color.Gray
                                ),
                                onClick = {
                                    Toast.makeText(
                                        context,
                                        "Hasil Penjumlahan = " + z.toString(),
                                        Toast.LENGTH_LONG
                                    ).show()
                                })
                            {

//                                buat variabel
//                                var = untuk data mutable ( variabel bisa dirubah)
//                                val = untuk data immutable (konstanta tidak dapat dirubah)

                                //                              .toInt (dari string ke int)
//                              kalo "21344" dibagi yang hasilnya koma salah satunya boleh pake float
//                              buat variabel context


                                Text(text = "Proses")

                            }
                        }
                    }
                }
            }
        }

        @Composable
        fun Greeting(name: String) {
            Text(text = "Hai $name!")
        }

        //@Preview(showBackground = true)
        @Composable
        fun DefaultPreview() {
            PJetpack20DXTheme {
                Greeting("Android")
            }
        }
    }
}