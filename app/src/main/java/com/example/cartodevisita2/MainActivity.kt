package com.example.cartodevisita2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.AndroidPaint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
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
        painter = painterResource(R.drawable.preto),
        contentDescription = null,
        contentScale = ContentScale.Crop,

    )
    Cabecalho()
    Rodape()

}
@Composable
fun Rodape() {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Bottom,

    ) {
        Contato(
            painter = painterResource(R.drawable.instagram),
            text ="isaac_r2"
        )
        Contato(
            painter = painterResource(R.drawable.facebook),
            text ="isaac teodoro"
        )
        Contato(
            painter = painterResource(R.drawable.whatsapp),
            text ="11 91051-5773"
        )
    }
}

@Composable
fun Contato(painter: Painter, text: String){

    Divider(
        color = Color.LightGray,
        modifier = Modifier
            .fillMaxWidth()
    )

    Row() {
        Image(
            painter = painter,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(34.dp)

        )
        Text(
            text = text,
            fontSize = 24.sp,
            color = Color(250,244,254)
        )
    }
}

@Composable
fun Cabecalho() {
    Column(

        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(painter = painterResource(R.drawable.simpson),
            contentDescription =null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(100.dp)
        )
        Text(
            text ="isaac teodoro",
            fontSize = 23.sp,
            fontWeight = FontWeight.Bold,
            color = Color(250,244,254)

        )
        Text(
            text = "estudante" ,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            color = Color(250,244,254)

        )

    }
}


