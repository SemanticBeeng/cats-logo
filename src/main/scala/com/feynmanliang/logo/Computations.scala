package com.feynmanliang.logo

import scala.math

import Logo._
import Base._

object Computations {
  def forward(pos: Position, l: Int): Position = pos.copy(
    x=pos.x + l*math.cos(pos.heading.value * math.Pi/180.0),
    y=pos.y + l*math.sin(pos.heading.value * math.Pi/180.0))

  def backward(pos: Position, l: Int): Position = pos.copy(
    x=pos.x - l*math.cos(pos.heading.value * math.Pi/180.0),
    y=pos.y - l*math.sin(pos.heading.value * math.Pi/180.0))

  def left(pos: Position, d: Degree): Position = pos.copy(
    heading=Degree(pos.heading.value + d.value))

  def right(pos: Position, d: Degree): Position = pos.copy(
    heading=Degree(pos.heading.value - d.value))
}
