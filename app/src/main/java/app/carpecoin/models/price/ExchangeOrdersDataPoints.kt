package app.carpecoin.models.price

import com.jjoe64.graphview.series.DataPoint

data class ExchangeOrdersDataPoints(var bidsLiveData: ArrayList<DataPoint>,
                                    var asksLiveData: ArrayList<DataPoint>)
