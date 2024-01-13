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
     <string>#</string> 
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
         <string>O</string> 
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
                                       <object idref="TMOperation4"/> 
                                      </void> 
                                      <void property="variables"> 
                                       <object class="java.util.HashSet"/> 
                                      </void> 
                                     </object> 
                                    </void> 
                                   </void> 
                                   <void property="operation"> 
                                    <int>5</int> 
                                   </void> 
                                   <void property="parameter"> 
                                    <string>add</string> 
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
                               <int>4</int> 
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
                     <string>a</string> 
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
           <int>4</int> 
          </void> 
          <void property="start"> 
           <boolean>true</boolean> 
          </void> 
         </object> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>99.0</double> 
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
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation1"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>187.0</double> 
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
         <string>a</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation2"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>275.0</double> 
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
         <string>L=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation3"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>355.0</double> 
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
         <string>O</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation4"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>429.0</double> 
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
         <string>5[add]</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation5"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>566.0</double> 
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
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkElbow"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object id="Vector2D0" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>167.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-48.0</double> 
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
             <double>6.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D0"/> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D1" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
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
              <double>133.0</double> 
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
             <double>119.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object id="Vector2D2" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
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
            <object id="Vector2D3" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>255.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-48.0</double> 
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
             <double>3.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D3"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>221.0</double> 
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
             <double>207.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
            <object id="Vector2D4" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>335.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-40.0</double> 
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
             <double>2.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D4"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>305.0</double> 
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
             <double>295.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
            <object id="Vector2D5" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>409.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-34.0</double> 
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
             <double>3.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D5"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>382.0</double> 
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
             <double>375.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
            <object id="Vector2D6" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>546.0</double> 
             </void> 
             <void property="y"> 
              <double>153.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-97.0</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-18.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D6"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>487.5</double> 
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
             <double>449.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
              <double>429.0</double> 
             </void> 
             <void property="y"> 
              <double>133.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="y"> 
              <double>-49.60000000000002</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>89.0</double> 
            </void> 
            <void property="y"> 
             <double>-69.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D7"/> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D8" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="y"> 
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
              <double>497.5</double> 
             </void> 
             <void property="y"> 
              <double>74.0</double> 
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
             <double>-48.0</double> 
            </void> 
            <void property="y"> 
             <double>-49.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="start"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>566.0</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D8"/> 
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
         <string>TOP</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation4"/> 
        </void> 
        <void property="targetAnchorKey"> 
         <string>TOP</string> 
        </void> 
       </object> 
      </void> 
     </void> 
     <void property="machine"> 
      <void property="name"> 
       <string>Enumeration (a+b)*</string> 
      </void> 
      <void property="operations"> 
       <void method="add"> 
        <object idref="TMOperation2"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation1"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation3"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation4"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation5"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation0"/> 
       </void> 
      </void> 
     </void> 
    </void> 
   </object> 
  </void> 
  <void method="add"> 
   <object class="edu.usfca.vas.data.DataWrapperTM"> 
    <void property="graphicMachine"> 
     <void property="elements"> 
      <void method="add"> 
       <object id="GElementTMOperation6" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R=#</string> 
        </void> 
        <void property="operation"> 
         <object id="TMOperation6" class="edu.usfca.vas.machine.tm.TMOperation"> 
          <void property="links"> 
           <void method="add"> 
            <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
             <void property="sourceOperation"> 
              <object idref="TMOperation6"/> 
             </void> 
             <void property="targetOperation"> 
              <object id="TMOperation7" class="edu.usfca.vas.machine.tm.TMOperation"> 
               <void property="links"> 
                <void method="add"> 
                 <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                  <void property="sourceOperation"> 
                   <object idref="TMOperation7"/> 
                  </void> 
                  <void property="symbol"> 
                   <string>a</string> 
                  </void> 
                  <void property="targetOperation"> 
                   <object id="TMOperation8" class="edu.usfca.vas.machine.tm.TMOperation"> 
                    <void property="operation"> 
                     <int>3</int> 
                    </void> 
                    <void property="parameter"> 
                     <string>b</string> 
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
                   <object idref="TMOperation7"/> 
                  </void> 
                  <void property="symbol"> 
                   <string>b</string> 
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
                     <string>a</string> 
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
                   <object idref="TMOperation7"/> 
                  </void> 
                  <void property="symbol"> 
                   <string>#</string> 
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
                        <object id="TMOperation11" class="edu.usfca.vas.machine.tm.TMOperation"> 
                         <void property="links"> 
                          <void method="add"> 
                           <object class="edu.usfca.vas.machine.tm.TMOperationLink"> 
                            <void property="sourceOperation"> 
                             <object idref="TMOperation11"/> 
                            </void> 
                            <void property="targetOperation"> 
                             <object id="TMOperation12" class="edu.usfca.vas.machine.tm.TMOperation"> 
                              <void property="operation"> 
                               <int>3</int> 
                              </void> 
                              <void property="parameter"> 
                               <string>a</string> 
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
                          <int>10</int> 
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
                <int>1</int> 
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
           <int>10</int> 
          </void> 
          <void property="parameter"> 
           <string>#</string> 
          </void> 
          <void property="start"> 
           <boolean>true</boolean> 
          </void> 
         </object> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>119.0</double> 
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
         <string>L</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation7"/> 
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
       <object id="GElementTMOperation8" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>b</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation8"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>345.0</double> 
         </void> 
         <void property="y"> 
          <double>67.0</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation9" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>a</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation9"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>347.0</double> 
         </void> 
         <void property="y"> 
          <double>193.60000000000002</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation10" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation10"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>349.0</double> 
         </void> 
         <void property="y"> 
          <double>307.20000000000005</double> 
         </void> 
        </void> 
       </object> 
      </void> 
      <void method="add"> 
       <object id="GElementTMOperation11" class="edu.usfca.vas.graphics.tm.GElementTMOperation"> 
        <void property="label"> 
         <string>R=#</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation11"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>464.0</double> 
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
         <string>a</string> 
        </void> 
        <void property="operation"> 
         <object idref="TMOperation12"/> 
        </void> 
        <void property="position"> 
         <void property="x"> 
          <double>566.0</double> 
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
            <object id="Vector2D9" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
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
              <double>-45.80000000000001</double> 
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
             <double>-4.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D9"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>151.9</double> 
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
             <double>139.0</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>325.0</double> 
             </void> 
             <void property="y"> 
              <double>67.0</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-79.4861614055115</double> 
             </void> 
             <void property="y"> 
              <double>-1.6882372513885855</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-7.0</double> 
            </void> 
            <void property="y"> 
             <double>2.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>325.0</double> 
            </void> 
            <void property="y"> 
             <double>67.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>245.5138385944885</double> 
             </void> 
             <void property="y"> 
              <double>65.3117627486114</double> 
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
             <double>204.8</double> 
            </void> 
            <void property="y"> 
             <double>133.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D8"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>a</string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation7"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>TOP</string> 
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
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>347.0</double> 
             </void> 
             <void property="y"> 
              <double>173.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-50.869096918770424</double> 
             </void> 
             <void property="y"> 
              <double>-72.51081782631275</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-58.0</double> 
            </void> 
            <void property="y"> 
             <double>-42.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>347.0</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D8"/> 
          </void> 
          <void property="flateness"> 
           <double>63.34251118460629</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>294.2457949197753</double> 
             </void> 
             <void property="y"> 
              <double>112.60719304017312</double> 
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
             <double>224.8</double> 
            </void> 
            <void property="y"> 
             <double>153.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>b</string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation7"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>RIGHT</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation9"/> 
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
              <double>204.8</double> 
             </void> 
             <void property="y"> 
              <double>173.60000000000002</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>53.01157633859242</double> 
             </void> 
             <void property="y"> 
              <double>84.30434611630403</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>74.19999999999999</double> 
            </void> 
            <void property="y"> 
             <double>53.39999999999998</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>204.8</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object id="Vector2D10" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="y"> 
             <double>1.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="flateness"> 
           <double>66.79999999999995</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>261.44009246228796</double> 
             </void> 
             <void property="y"> 
              <double>245.00497129656645</double> 
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
             <double>347.0</double> 
            </void> 
            <void property="y"> 
             <double>213.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D10"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string></string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation9"/> 
        </void> 
        <void property="sourceAnchorKey"> 
         <string>BOTTOM</string> 
        </void> 
        <void property="target"> 
         <object idref="GElementTMOperation7"/> 
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
         <object class="edu.usfca.xj.appkit.gview.shape.SLinkArc"> 
          <void property="arrow"> 
           <void property="anchor"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>329.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-101.87543560683966</double> 
             </void> 
             <void property="y"> 
              <double>-29.823135461306265</double> 
             </void> 
            </object> 
           </void> 
          </void> 
          <void property="direction"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>-87.0</double> 
            </void> 
            <void property="y"> 
             <double>-9.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
            <void property="x"> 
             <double>329.0</double> 
            </void> 
            <void property="y"> 
             <double>307.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>-54.30813740892571</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>232.3642248318647</double> 
             </void> 
             <void property="y"> 
              <double>272.5058628434312</double> 
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
             <double>204.8</double> 
            </void> 
            <void property="y"> 
             <double>173.60000000000002</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D10"/> 
          </void> 
         </object> 
        </void> 
        <void property="pattern"> 
         <string>#</string> 
        </void> 
        <void property="source"> 
         <object idref="GElementTMOperation7"/> 
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
            <object id="Vector2D11" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>444.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-75.0</double> 
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
             <double>7.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D11"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>396.5</double> 
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
             <double>369.0</double> 
            </void> 
            <void property="y"> 
             <double>307.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
         <object idref="GElementTMOperation10"/> 
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
            <object id="Vector2D12" class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>546.0</double> 
             </void> 
             <void property="y"> 
              <double>307.20000000000005</double> 
             </void> 
            </object> 
           </void> 
           <void property="direction"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>-62.0</double> 
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
             <double>3.0</double> 
            </void> 
           </object> 
          </void> 
          <void property="end"> 
           <object idref="Vector2D12"/> 
          </void> 
          <void property="endDirection"> 
           <object idref="Vector2D1"/> 
          </void> 
          <void property="flateness"> 
           <double>40.0</double> 
          </void> 
          <void property="label"> 
           <void property="position"> 
            <object class="edu.usfca.xj.appkit.gview.base.Vector2D"> 
             <void property="x"> 
              <double>505.0</double> 
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
             <double>484.0</double> 
            </void> 
            <void property="y"> 
             <double>307.20000000000005</double> 
            </void> 
           </object> 
          </void> 
          <void property="startDirection"> 
           <object idref="Vector2D2"/> 
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
         <object idref="GElementTMOperation11"/> 
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
     </void> 
     <void property="machine"> 
      <void property="name"> 
       <string>add</string> 
      </void> 
      <void property="operations"> 
       <void method="add"> 
        <object idref="TMOperation12"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation7"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation6"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation11"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation9"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation8"/> 
       </void> 
       <void method="add"> 
        <object idref="TMOperation10"/> 
       </void> 
      </void> 
     </void> 
    </void> 
   </object> 
  </void> 
 </object> 
 <int>0</int> 
</java> 
