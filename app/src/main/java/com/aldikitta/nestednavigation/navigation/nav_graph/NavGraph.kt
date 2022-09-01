package com.aldikitta.nestednavigation.navigation.nav_graph

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.aldikitta.nestednavigation.navigation.AUTH_GRAPH_ROUTE
import com.aldikitta.nestednavigation.navigation.HOME_GRAPH_ROUTE
import com.aldikitta.nestednavigation.navigation.ROOT_GRAPH_ROUTE

@Composable
fun SetupNavGraph(
    navController: NavHostController
) {
    val isAuth by remember {
        mutableStateOf(false)
    }
    NavHost(
        navController = navController,
//        startDestination = HOME_GRAPH_ROUTE,
        startDestination = if (isAuth) {
            HOME_GRAPH_ROUTE
        } else {
            AUTH_GRAPH_ROUTE
        },
        route = ROOT_GRAPH_ROUTE
    ) {
        authNavGraph(navController = navController)
        homeNavGraph(navController = navController)
    }
}