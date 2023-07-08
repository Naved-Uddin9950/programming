import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

// imported components
import Header from './components/Header'
import Card from './components/Card'

// imported database
import data from './database/data.json'

function App() {

  return (
    <div className="main-container">
      <Header></Header>
      <div className="main-body">
        {
          data.map((data) => {
            return (
              <Card title={data.movie} rating={data.rating} image={data.image} imdb={data.imdb_url}></Card>
            )
          })
        }
      </div>
    </div>
  )
}

export default App
