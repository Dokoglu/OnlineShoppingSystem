import React from 'react'
import 'semantic-ui-css/semantic.min.css'
import Navi from './Navi'
import Categories from './Categories'
import ProductList from '../Pages/ProductList'

export default function Dashboards() {
  return (
    <div>
        <Categories/>
        <ProductList/>
    </div>
  )
}