package com.example.recetario.views

import android.annotation.SuppressLint
import android.graphics.drawable.Drawable
import android.media.Image
import android.util.Log
import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetario.R
import com.example.recetario.components.MainButton
import com.example.recetario.components.TitleBar
import com.example.recetario.navigation.AppRoutes

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController) {
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title={
                    TitleBar("R E C E T A R I O")
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color(205, 92, 92) //Indian Red.
                )
            )
        }
    ){ innerPadding ->
        ContentViewH(navController = navController, modifier = Modifier.padding(innerPadding))
    }
}

@Composable
private fun ContentViewH(navController: NavController, modifier: Modifier = Modifier){
    val backgroundImage: Painter = painterResource(id = R.drawable.home)
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = backgroundImage,
            contentDescription = "Imagen de fondo",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.5f)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.Start //Las opciones están alineadas a la izquierda y no en el centro.
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                CircleImageView(R.drawable.crossaint, "Crossaint")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("CROSSAINT", Color(233, 150, 122), Color.White) {
                    navController.navigate(AppRoutes.CROSSAINT)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                CircleImageView(R.drawable.brownie, "Brownie")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("BROWNIE", Color(233, 150, 122), Color.White) {
                    navController.navigate(AppRoutes.BROWNIE)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                CircleImageView(R.drawable.cookies, "Cookies")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("CHOCOLATE COOKIES", Color(233, 150, 122), Color.White) {
                    navController.navigate(AppRoutes.COOKIES)
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.padding(15.dp)
            ) {
                CircleImageView(R.drawable.carrots, "Cake")
                Spacer(modifier = Modifier.width(16.dp))
                MainButton("CARROT CAKE", Color(233, 150, 122), Color.White) {
                    navController.navigate(AppRoutes.CARROT)
                }
            }
        }
    }
}

@Composable
fun CircleImageView(imageId: Int, imageDesc: String) {
    Image( painter = painterResource(id = imageId),
        contentDescription = imageDesc,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .size(125.dp)
            .clip(RoundedCornerShape(10))
            .border(5.dp, Color(233, 150, 122), RoundedCornerShape(10))
    )
}