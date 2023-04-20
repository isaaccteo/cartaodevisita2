package com.example.cartodevisita2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cartodevisita2.ui.theme.Cartãodevisita2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Cartãodevisita2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(242,102,1295)
                ) {
                    PlanodeFundo()
                }
            }
        }
    }
}
@Composable
fun PlanodeFundo() {
    Image(
        painter = painterResource(id = R.drawable.abstract_gda231a9d8_1920,),
        contentDescription = null,
        contentScale = ContentScale.Crop,

    )
    Cabecalho()
    Rodape()

}
@Composable
fun Rodape() {
    Column {
        Contato()
        Contato()
        Contato()
        
        
    }
   
}
@Composable
fun Contato(){
    Row() {
        Image(painter = painterResource(id = ), contentDescription = )
        
    }
    
}


@Composable
fun Cabecalho() {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(id = R.drawable.unnamed),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .aspectRatio(12f / 9f)
                .clip(RoundedCornerShape(16.dp))


        )
    Text(
        text ="Anna Clara Mota Pedrosa da silva",
        fontSize = 23.sp,
        fontWeight = FontWeight.Bold

    )
    Text(
        text = "estudante",
        fontSize = 25.sp,
        fontWeight = FontWeight.Bold

    )


     }
}


