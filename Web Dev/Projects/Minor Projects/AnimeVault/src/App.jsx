import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

// imported components
import Header from './components/Header'
import Card from './components/Card'

// imported Bootstrap
import '../node_modules/bootstrap/dist/css/bootstrap.min.css'
import "../node_modules/bootstrap/dist/js/bootstrap.bundle.min.js";

// imported database file
import data from './database/livechart-raw-data.json'

function App() {

  return (
    <div className="main-container">
      <Header></Header>
      <div className="main-body">
        {
          data.map((element) => {
            return (

              <Card lvID={element.liveChartId} title={element.title} ogTitle={element.originalTitle} description={element.description} year={element.premiere} ogSite={element.officialWebsiteURL} twitter={element.twitterURL} format={element.format} source={element.source} ep={element.episodes} runTime={element.runTime} tags={element.tags} studio={element.studio} reso={element.externalResources}></Card>
            )

          })
        }
      </div>
    </div>
  )
}

export default App
