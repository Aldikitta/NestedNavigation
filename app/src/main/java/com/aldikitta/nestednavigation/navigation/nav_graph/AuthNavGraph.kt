package com.aldikitta.nestednavigation.navigation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.aldikitta.nestednavigation.navigation.AUTH_GRAPH_ROUTE
import com.aldikitta.nestednavigation.navigation.Screen
import com.aldikitta.nestednavigation.screens.LoginScreen
import com.aldikitta.nestednavigation.screens.SignUpScreen

fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTH_GRAPH_ROUTE
    ){
        composable(
            route = Screen.Login.route
        ) {
            LoginScreen(navController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ) {
            SignUpScreen(navController = navController)
        }
    }
}