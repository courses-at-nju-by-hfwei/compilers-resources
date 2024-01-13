<?xml version="1.0" encoding="UTF-8"?> 
<java version="1.4.2_09" class="java.beans.XMLDecoder"> 
 <object class="java.util.HashMap"> 
  <void method="put"> 
   <string>KEY_TAPE_CONFIGS</string> 
   <object class="java.util.ArrayList"/> 
  </void> 
  <void method="put"> 
   <string>KEY_DEFAULT_CONFIG</string> 
   <object class="edu.usfca.vas.window.tm.TapeConfiguration"> 
    <void property="content"> 
     <string>#aabbac</string> 
    </void> 
   </object> 
  </void> 
 </object> 
 <object class="java.util.ArrayList"> 
  <void method="add"> 
   <object class="edu.usfca.vas.data.DataWrapperTM"> 
    <void property="graphicMachine"> 
     <void property="elements"> 
      <void method="add"> 
       <object id="GElementTMOperation0" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object id="TMOperation0" class="edu.usfca.vas.machine.tm.TMOperation"> 
          <void property="links"> 
           <void method="add"> 
            <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
             <void property="sourceOperation"> 
              <object idref="TMOperation0"/> 
             </void> 
             <void property="targetOperation"> 
              <object idref="TMOperation0"/> 
             </void> 
             <void property="variables"> 
              <object class="java.util.HashSet"/> 
             </void> 
            </object> 
           </void> 
           <void method="add"> 
            <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
             <void property="sourceOperation"> 
              <object idref="TMOperation0"/> 
             </void> 
             <void property="symbol"> 
              <string>a</string> 
             </void> 
             <void property="targetOperation"> 
              <object id="TMOperation1" class="edu.usfca.vas.machine.tm.TMOperation"> 
               <void property="links"> 
                <void method="add"> 
                 <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                  <void property="sourceOperation"> 
                   <object idref="TMOperation1"/> 
                  </void> 
                  <void property="targetOperation"> 
                   <object id="TMOperation2" class="edu.usfca.vas.machine.tm.TMOperation"> 
                    <void property="links"> 
                     <void method="add"> 
                      <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                       <void property="sourceOperation"> 
                        <object idref="TMOperation2"/> 
                       </void> 
                       <void property="targetOperation"> 
                        <object id="TMOperation3" class="edu.usfca.vas.machine.tm.TMOperation"> 
                         <void property="links"> 
                          <void method="add"> 
                           <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                            <void property="sourceOperation"> 
                             <object idref="TMOperation3"/> 
                            </void> 
                            <void property="targetOperation"> 
                             <object idref="TMOperation3"/> 
                            </void> 
                            <void property="variables"> 
                             <object class="java.util.HashSet"/> 
                            </void> 
                           </object> 
                          </void> 
                          <void method="add"> 
                           <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                            <void property="sourceOperation"> 
                             <object idref="TMOperation3"/> 
                            </void> 
                            <void property="symbol"> 
                             <string>b</string> 
                            </void> 
                            <void property="targetOperation"> 
                             <object id="TMOperation4" class="edu.usfca.vas.machine.tm.TMOperation"> 
                              <void property="links"> 
                               <void method="add"> 
                                <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                 <void property="sourceOperation"> 
                                  <object idref="TMOperation4"/> 
                                 </void> 
                                 <void property="targetOperation"> 
                                  <object id="TMOperation5" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                   <void property="links"> 
                                    <void method="add"> 
                                     <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                      <void property="sourceOperation"> 
                                       <object idref="TMOperation5"/> 
                                      </void> 
                                      <void property="targetOperation"> 
                                       <object id="TMOperation6" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                        <void property="links"> 
                                         <void method="add"> 
                                          <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                           <void property="sourceOperation"> 
                                            <object idref="TMOperation6"/> 
                                           </void> 
                                           <void property="targetOperation"> 
                                            <object idref="TMOperation6"/> 
                                           </void> 
                                           <void property="variables"> 
                                            <object class="java.util.HashSet"/> 
                                           </void> 
                                          </object> 
                                         </void> 
                                         <void method="add"> 
                                          <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                           <void property="sourceOperation"> 
                                            <object idref="TMOperation6"/> 
                                           </void> 
                                           <void property="symbol"> 
                                            <string>#</string> 
                                           </void> 
                                           <void property="targetOperation"> 
                                            <object id="TMOperation7" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                             <void property="links"> 
                                              <void method="add"> 
                                               <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                                <void property="sourceOperation"> 
                                                 <object idref="TMOperation7"/> 
                                                </void> 
                                                <void property="targetOperation"> 
                                                 <object idref="TMOperation0"/> 
                                                </void> 
                                                <void property="variables"> 
                                                 <object class="java.util.HashSet"/> 
                                                </void> 
                                               </object> 
                                              </void> 
                                             </void> 
                                             <void property="operation"> 
                                              <int>8</int> 
                                             </void> 
                                             <void property="parameter"> 
                                              <string>#</string> 
                                             </void> 
                                            </object> 
                                           </void> 
                                           <void property="variables"> 
                                            <object class="java.util.HashSet"/> 
                                           </void> 
                                          </object> 
                                         </void> 
                                         <void method="add"> 
                                          <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                           <void property="sourceOperation"> 
                                            <object idref="TMOperation6"/> 
                                           </void> 
                                           <void property="symbol"> 
                                            <string>c</string> 
                                           </void> 
                                           <void property="targetOperation"> 
                                            <object id="TMOperation8" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                             <void property="links"> 
                                              <void method="add"> 
                                               <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                                <void property="sourceOperation"> 
                                                 <object idref="TMOperation8"/> 
                                                </void> 
                                                <void property="targetOperation"> 
                                                 <object idref="TMOperation7"/> 
                                                </void> 
                                                <void property="variables"> 
                                                 <object class="java.util.HashSet"/> 
                                                </void> 
                                               </object> 
                                              </void> 
                                             </void> 
                                             <void property="operation"> 
                                              <int>3</int> 
                                             </void> 
                                             <void property="parameter"> 
                                              <string>X</string> 
                                             </void> 
                                            </object> 
                                           </void> 
                                           <void property="variables"> 
                                            <object class="java.util.HashSet"/> 
                                           </void> 
                                          </object> 
                                         </void> 
                                        </void> 
                                        <void property="operation"> 
                                         <int>2</int> 
                                        </void> 
                                       </object> 
                                      </void> 
                                      <void property="variables"> 
                                       <object class="java.util.HashSet"/> 
                                      </void> 
                                     </object> 
                                    </void> 
                                   </void> 
                                   <void property="operation"> 
                                    <int>8</int> 
                                   </void> 
                                   <void property="parameter"> 
                                    <string>#</string> 
                                   </void> 
                                  </object> 
                                 </void> 
                                 <void property="variables"> 
                                  <object class="java.util.HashSet"/> 
                                 </void> 
                                </object> 
                               </void> 
                              </void> 
                              <void property="operation"> 
                               <int>3</int> 
                              </void> 
                              <void property="parameter"> 
                               <string>X</string> 
                              </void> 
                             </object> 
                            </void> 
                            <void property="variables"> 
                             <object class="java.util.HashSet"/> 
                            </void> 
                           </object> 
                          </void> 
                          <void method="add"> 
                           <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                            <void property="sourceOperation"> 
                             <object idref="TMOperation3"/> 
                            </void> 
                            <void property="symbol"> 
                             <string>#</string> 
                            </void> 
                            <void property="targetOperation"> 
                             <object id="TMOperation9" class="edu.usfca.vas.machine.tm.TMOperation"> 
                              <void property="links"> 
                               <void method="add"> 
                                <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                 <void property="sourceOperation"> 
                                  <object idref="TMOperation9"/> 
                                 </void> 
                                 <void property="targetOperation"> 
                                  <object id="TMOperation10" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                   <void property="links"> 
                                    <void method="add"> 
                                     <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                      <void property="sourceOperation"> 
                                       <object idref="TMOperation10"/> 
                                      </void> 
                                      <void property="targetOperation"> 
                                       <object idref="TMOperation10"/> 
                                      </void> 
                                      <void property="variables"> 
                                       <object class="java.util.HashSet"/> 
                                      </void> 
                                     </object> 
                                    </void> 
                                    <void method="add"> 
                                     <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                      <void property="sourceOperation"> 
                                       <object idref="TMOperation10"/> 
                                      </void> 
                                      <void property="symbol"> 
                                       <string>#</string> 
                                      </void> 
                                      <void property="targetOperation"> 
                                       <object id="TMOperation11" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                        <void property="operation"> 
                                         <int>6</int> 
                                        </void> 
                                       </object> 
                                      </void> 
                                      <void property="variables"> 
                                       <object class="java.util.HashSet"/> 
                                      </void> 
                                     </object> 
                                    </void> 
                                    <void method="add"> 
                                     <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                                      <void property="sourceOperation"> 
                                       <object idref="TMOperation10"/> 
                                      </void> 
                                      <void property="symbol"> 
                                       <string>c</string> 
                                      </void> 
                                      <void property="targetOperation"> 
                                       <object id="TMOperation12" class="edu.usfca.vas.machine.tm.TMOperation"> 
                                        <void property="operation"> 
                                         <int>7</int> 
                                        </void> 
                                       </object> 
                                      </void> 
                                      <void property="variables"> 
                                       <object class="java.util.HashSet"/> 
                                      </void> 
                                     </object> 
                                    </void> 
                                   </void> 
                                   <void property="operation"> 
                                    <int>2</int> 
                                   </void> 
                                  </object> 
                                 </void> 
                                 <void property="variables"> 
                                  <object class="java.util.HashSet"/> 
                                 </void> 
                                </object> 
                               </void> 
                              </void> 
                              <void property="operation"> 
                               <int>8</int> 
                              </void> 
                              <void property="parameter"> 
                               <string>#</string> 
                              </void> 
                             </object> 
                            </void> 
                            <void property="variables"> 
                             <object class="java.util.HashSet"/> 
                            </void> 
                           </object> 
                          </void> 
                         </void> 
                         <void property="operation"> 
                          <int>2</int> 
                         </void> 
                        </object> 
                       </void> 
                       <void property="variables"> 
                        <object class="java.util.HashSet"/> 
                       </void> 
                      </object> 
                     </void> 
                    </void> 
                    <void property="operation"> 
                     <int>8</int> 
                    </void> 
                    <void property="parameter"> 
                     <string>#</string> 
                    </void> 
                   </object> 
                  </void> 
                  <void property="variables"> 
                   <object class="java.util.HashSet"/> 
                  </void> 
                 </object> 
                </void> 
               </void> 
               <void property="operation"> 
                <int>3</int> 
               </void> 
               <void property="parameter"> 
                <string>X</string> 
               </void> 
              </object> 
             </void> 
             <void property="variables"> 
              <object class="java.util.HashSet"/> 
             </void> 
            </object> 
           </void> 
           <void method="add"> 
            <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
             <void property="sourceOperation"> 
              <object idref="TMOperation0"/> 
             </void> 
             <void property="symbol"> 
              <string>#</string> 
             </void> 
             <void property="targetOperation"> 
              <object id="TMOperation13" class="edu.usfca.vas.machine.tm.TMOperation"> 
               <void property="operation"> 
                <int>7</int> 
               </void> 
              </object> 
             </void> 
             <void property="variables"> 
              <object class="java.util.HashSet"/> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="operation"> 
           <int>2</int> 
          </void> 
          <void property="start"> 
           <boolean>true</boolean> 
          </void> 
         </object> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>85.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation1" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>X</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation1"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>204.8</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation2" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>L=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation2"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>301.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation3" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation3"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>382.6</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation4" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>X</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation4"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>486.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation5" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>L=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation5"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>577.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation6" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation6"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>656.4000000000001</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation7" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>X</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation8"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>755.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation8" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>L=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation7"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>863.0</double> 
         </void> 
         <void property="y"> 
          <double>153.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>85.0</double> 
             </void> 
             <void property="y"> 
              <double>133.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>102.33899086866134</double> 
             </void> 
             <void property="y"> 
              <double>-10.884178792359776</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>42.0</double> 
            </void> 
            <void property="y"> 
             <double>-43.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>85.0</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D0" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="y"> 
             <double>-1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>137.4065297456151</double> 
             </void> 
             <void property="y"> 
              <double>79.19703102598051</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="selfLoop"> 
           <boolean>true</boolean> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>85.0</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation0"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation0"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>382.6</double> 
             </void> 
             <void property="y"> 
              <double>133.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>64.82819443905078</double> 
             </void> 
             <void property="y"> 
              <double>-76.14003681226205</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>0.39999999999997726</double> 
            </void> 
            <void property="y"> 
             <double>-55.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>382.6</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>383.1395543826044</double> 
             </void> 
             <void property="y"> 
              <double>58.60194081799044</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="selfLoop"> 
           <boolean>true</boolean> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>382.6</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation3"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation3"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>656.4000000000001</double> 
             </void> 
             <void property="y"> 
              <double>133.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>61.81573241875412</double> 
             </void> 
             <void property="y"> 
              <double>-78.60544017771916</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-0.40000000000009095</double> 
            </void> 
            <void property="y"> 
             <double>-12.600000000000023</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>656.4000000000001</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>654.0202464873915</double> 
             </void> 
             <void property="y"> 
              <double>58.63776435284748</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="selfLoop"> 
           <boolean>true</boolean> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>656.4000000000001</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation6"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation6"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D1" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>863.0</double> 
             </void> 
             <void property="y"> 
              <double>173.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="y"> 
              <double>31.399999999999977</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-163.0</double> 
            </void> 
            <void property="y"> 
             <double>51.39999999999998</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D2" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="y"> 
             <double>1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>759.7</double> 
             </void> 
             <void property="y"> 
              <double>215.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>#</string> 
           </void> 
          </void> 
          <void property="offsetToMouse"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>43.59999999999991</double> 
            </void> 
            <void property="y"> 
             <double>31.399999999999977</double> 
            </void> 
           </object> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>656.4000000000001</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>#</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation6"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation8"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D3" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>843.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-68.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-20.0</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D3"/> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D4" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>799.0</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>775.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object id="Vector2D5" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>1.0</double> 
            </void> 
           </object> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation7"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation8"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D6" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>735.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-58.59999999999991</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-9.0</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D6"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>695.7</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>c</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>676.4000000000001</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>c</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation6"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation7"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D7" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>636.4000000000001</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-39.40000000000009</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-19.40000000000009</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D7"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>606.7</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>597.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation5"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation6"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D8" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>281.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-56.19999999999999</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-17.0</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D8"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>242.9</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>224.8</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation1"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation2"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D9" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>362.6</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-41.60000000000002</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-17.600000000000023</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D9"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>331.8</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>321.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation2"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation3"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D10" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>466.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-63.39999999999998</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-19.0</double> 
            </void> 
            <void property="y"> 
             <double>0.39999999999997726</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D10"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>424.3</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>b</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>402.6</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>b</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation3"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation4"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D11" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>184.8</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-79.80000000000001</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-130.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D11"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>20.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>134.9</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>a</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>105.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>a</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation0"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation1"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D12" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>557.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-51.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-20.0</double> 
            </void> 
            <void property="y"> 
             <double>-2.6000000000000227</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D12"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>521.5</double> 
             </void> 
             <void property="y"> 
              <double>143.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>506.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation4"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation5"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation9" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>N</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation13"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>204.8</double> 
         </void> 
         <void property="y"> 
          <double>258.0</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation10" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>N</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation12"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>678.0</double> 
         </void> 
         <void property="y"> 
          <double>381.0</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation11" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>Y</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation11"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>679.0</double> 
         </void> 
         <void property="y"> 
          <double>307.20000000000005</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation12" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation10"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>575.0</double> 
         </void> 
         <void property="y"> 
          <double>307.20000000000005</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation13" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>L=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation9"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>459.0</double> 
         </void> 
         <void property="y"> 
          <double>307.20000000000005</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D13" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>439.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-56.39999999999998</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-20.0</double> 
            </void> 
            <void property="y"> 
             <double>-1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D13"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>410.8</double> 
             </void> 
             <void property="y"> 
              <double>297.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>#</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>382.6</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>#</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation3"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation13"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D14" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>555.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-76.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-18.0</double> 
            </void> 
            <void property="y"> 
             <double>1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D14"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>507.0</double> 
             </void> 
             <void property="y"> 
              <double>297.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>479.0</double> 
            </void> 
            <void property="y"> 
             <double>307.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation13"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation12"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>575.0</double> 
             </void> 
             <void property="y"> 
              <double>287.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>72.34516070119707</double> 
             </void> 
             <void property="y"> 
              <double>-69.03750953733751</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>2.0</double> 
            </void> 
            <void property="y"> 
             <double>-18.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>575.0</double> 
            </void> 
            <void property="y"> 
             <double>287.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>583.2823644556134</double> 
             </void> 
             <void property="y"> 
              <double>212.65871989947863</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="selfLoop"> 
           <boolean>true</boolean> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>575.0</double> 
            </void> 
            <void property="y"> 
             <double>287.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation12"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation12"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D15" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>659.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-64.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-13.0</double> 
            </void> 
            <void property="y"> 
             <double>-2.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D15"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>617.0</double> 
             </void> 
             <void property="y"> 
              <double>297.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>#</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>595.0</double> 
            </void> 
            <void property="y"> 
             <double>307.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D5"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>#</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation12"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation11"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D16" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>658.0</double> 
             </void> 
             <void property="y"> 
              <double>381.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-83.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-20.0</double> 
            </void> 
            <void property="y"> 
             <double>-3.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D16"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>616.5</double> 
             </void> 
             <void property="y"> 
              <double>371.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>c</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>575.0</double> 
            </void> 
            <void property="y"> 
             <double>327.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>c</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation12"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation10"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D17" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>184.8</double> 
             </void> 
             <void property="y"> 
              <double>258.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-99.80000000000001</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-19.80000000000001</double> 
            </void> 
            <void property="y"> 
             <double>2.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D17"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>134.9</double> 
             </void> 
             <void property="y"> 
              <double>248.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string>#</string> 
           </void> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>85.0</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>#</string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation0"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation9"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>LEFT</string> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object class="edu.usfca.xj.appkit.gview.object.GLink"> 
        <void property="labelVisible"> 
         <boolean>true</boolean> 
        </void> 
        <void property="link"> 
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D18" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>85.0</double> 
             </void> 
             <void property="y"> 
              <double>133.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="y"> 
              <double>-85.60000000000002</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>188.0</double> 
            </void> 
            <void property="y"> 
             <double>-105.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D18"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>474.0</double> 
             </void> 
             <void property="y"> 
              <double>38.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="title"> 
            <string></string> 
           </void> 
          </void> 
          <void property="offsetToMouse"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-590.0</double> 
            </void> 
            <void property="y"> 
             <double>-85.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>863.0</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D0"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="shape"> 
         <int>1</int> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation8"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation0"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
     </void> 
     <void property="machine"> 
      <void property="name"> 
       <string>a &gt; b &gt; c</string> 
      </void> 
      <void property="operations"> 
       <void method="add"> 
        <object idref="TMOperation10"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation12"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation11"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation13"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation5"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation3"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation4"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation6"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation9"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation1"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation7"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation8"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation2"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation0"/> 
       </void> 
      </void> 
     </void> 
    </void> 
   </object> 
  </void> 
 </object> 
 <int>0</int> 
</java> 
