import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

// imported components
import Header from './components/Header'

// imported Bootstrap
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import "../node_modules/bootstrap/dist/js/bootstrap.bundle.min.js";

function App() {

  return (
    <div className="main-container">
      <Header></Header>
    </div>
  )
}

export default App
