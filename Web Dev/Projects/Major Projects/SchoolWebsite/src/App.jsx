import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

// Bootstrap imported from here
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import "../node_modules/bootstrap/dist/js/bootstrap.bundle.min.js";

// Components imported from here
import Header from '../components/Header'
import HeroSection from '../components/HeroSection'
import MainSection from '../components/MainSection'

function App() {
    return (
        <>
            <Header></Header>
            <HeroSection></HeroSection>
            <MainSection></MainSection>
        </>
    )
}

export default App
